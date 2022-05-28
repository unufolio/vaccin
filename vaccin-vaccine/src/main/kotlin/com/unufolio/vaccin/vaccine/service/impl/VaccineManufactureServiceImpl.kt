package com.unufolio.vaccin.vaccine.service.impl

import com.unufolio.common.ResultEntity
import com.unufolio.common.page.IPage
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineManufactureDO
import com.unufolio.vaccin.vaccine.enums.VaccineManufactureBusinessResultCodeEnum
import com.unufolio.vaccin.vaccine.service.VaccineManufactureService
import org.springframework.stereotype.Service

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Service
class VaccineManufactureServiceImpl(val vaccineFactoryRepository: VaccineFactoryRepository) : VaccineManufactureService {
    override fun create(vaccineManufactureDO: VaccineManufactureDO): ResultEntity<Void> {
        if (codeExist(vaccineManufactureDO)) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_CODE_EXIST)
        } else {
            vaccineManufactureDO.isOnline = true
            val res = vaccineFactoryRepository.save(vaccineManufactureDO)
            if (res < 1) {
                return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_CREATE_FAILURE)
            }
            return ResultEntity.success()
        }
    }

    override fun retrieve(code: String): ResultEntity<VaccineManufactureDO> {
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(VaccineManufactureDO(code = code))
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_NOT_EXIST)
        }
        return ResultEntity.success(vaccineFactoryFromDb)
    }

    override fun update(vaccineManufactureDO: VaccineManufactureDO): ResultEntity<Void> {
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirstByCode(vaccineManufactureDO.code!!)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_NOT_EXIST)
        }
        val res = vaccineFactoryRepository.update(vaccineManufactureDO)
        if (res < 1) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_UPDATE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun online(code: String): ResultEntity<Void> {
        val vaccineManufactureDO = VaccineManufactureDO(code = code)
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(vaccineManufactureDO)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        val res = updateIsOnline(vaccineManufactureDO, true)
        if (res < 1) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_ONLINE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun offline(code: String): ResultEntity<Void> {
        val vaccineManufactureDO = VaccineManufactureDO(code = code)
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(vaccineManufactureDO)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        val res = updateIsOnline(vaccineManufactureDO, false)
        if (res < 1) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_OFFLINE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun delete(code: String): ResultEntity<Void> {
        val vaccineManufactureDO = VaccineManufactureDO(code = code)
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(vaccineManufactureDO)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        val res = vaccineFactoryRepository.delete(vaccineManufactureDO)
        if (res < 1) {
            return ResultEntity.failure(VaccineManufactureBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun list(vaccineManufactureDO: VaccineManufactureDO): List<VaccineManufactureDO> {
        return vaccineFactoryRepository.list(vaccineManufactureDO)
    }

    override fun page(vaccineManufactureDO: VaccineManufactureDO): IPage<VaccineManufactureDO> {
        return vaccineFactoryRepository.page(vaccineManufactureDO)
    }

    private fun codeExist(vaccineManufactureDO: VaccineManufactureDO): Boolean {
        val query = VaccineManufactureDO(code = vaccineManufactureDO.code)
        if (vaccineManufactureDO.code.isNullOrBlank()) {
            return vaccineFactoryRepository.exist(query);
        }
        return vaccineFactoryRepository.existNotThisCode(query);
    }

    private fun updateIsOnline(vaccineManufactureDO: VaccineManufactureDO, isOnline: Boolean): Int {
        vaccineManufactureDO.isOnline = isOnline;
        return vaccineFactoryRepository.update(vaccineManufactureDO)
    }

}