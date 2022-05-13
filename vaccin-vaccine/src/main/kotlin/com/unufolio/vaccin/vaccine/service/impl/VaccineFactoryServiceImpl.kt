package com.unufolio.vaccin.vaccine.service.impl

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.enums.VaccineFactoryBusinessResultCodeEnum
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import org.springframework.stereotype.Service

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Service
class VaccineFactoryServiceImpl(val vaccineFactoryRepository: VaccineFactoryRepository) : VaccineFactoryService {
    override fun create(vaccineFactoryDO: VaccineFactoryDO): ResultEntity<Void> {
        if (codeExist(vaccineFactoryDO)) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_CODE_EXIST)
        } else {
            vaccineFactoryDO.isOnline = true
            val res = vaccineFactoryRepository.save(vaccineFactoryDO)
            if (res < 1) {
                return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_CREATE_FAILURE)
            }
            return ResultEntity.success()
        }
    }

    override fun retrieve(code: String): ResultEntity<VaccineFactoryDO> {
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(VaccineFactoryDO(code = code))
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_NOT_EXIST)
        }
        return ResultEntity.success(vaccineFactoryFromDb)
    }

    override fun update(vaccineFactoryDO: VaccineFactoryDO): ResultEntity<Void> {
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirstByCode(vaccineFactoryDO.code!!)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_NOT_EXIST)
        }
        val res = vaccineFactoryRepository.update(vaccineFactoryDO)
        if (res < 1) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_UPDATE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun online(code: String): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryDO(code = code)
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(vaccineFactoryDO)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        val res = updateIsOnline(vaccineFactoryDO, true)
        if (res < 1) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_ONLINE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun offline(code: String): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryDO(code = code)
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(vaccineFactoryDO)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        val res = updateIsOnline(vaccineFactoryDO, false)
        if (res < 1) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_ONLINE_FAILURE)
        }
        return ResultEntity.success()
    }

    override fun delete(code: String): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryDO(code = code)
        val vaccineFactoryFromDb = vaccineFactoryRepository.selectFirst(vaccineFactoryDO)
        if (vaccineFactoryFromDb == null) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        val res = vaccineFactoryRepository.delete(vaccineFactoryDO)
        if (res < 1) {
            return ResultEntity.failure(VaccineFactoryBusinessResultCodeEnum.VACCINE_FACTORY_DELETE_FAILURE)
        }
        return ResultEntity.success()
    }

    private fun codeExist(vaccineFactoryDO: VaccineFactoryDO): Boolean {
        val query = VaccineFactoryDO(code = vaccineFactoryDO.code)
        if (vaccineFactoryDO.code.isNullOrBlank()) {
            return vaccineFactoryRepository.exist(query);
        }
        return vaccineFactoryRepository.existNotThisCode(query);
    }

    private fun updateIsOnline(vaccineFactoryDO: VaccineFactoryDO, isOnline: Boolean): Int {
        vaccineFactoryDO.isOnline = isOnline;
        return vaccineFactoryRepository.update(vaccineFactoryDO)
    }

}