package com.unufolio.vaccin.vaccine.service.impl

import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import org.springframework.stereotype.Service

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Service
class VaccineFactoryServiceImpl(val vaccineFactoryRepository: VaccineFactoryRepository) : VaccineFactoryService {
    override fun create(vaccineFactoryDO: VaccineFactoryDO) {
        if (codeExist(vaccineFactoryDO)) {
            println("code exist")
        } else {
            vaccineFactoryRepository.save(vaccineFactoryDO)
        }
    }

    override fun retrieve() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun online() {
        TODO("Not yet implemented")
    }

    override fun offline() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    private fun codeExist(vaccineFactoryDO: VaccineFactoryDO): Boolean {
        val query = VaccineFactoryDO().apply { code = vaccineFactoryDO.code };
        return vaccineFactoryRepository.selectFirst(query) != null;
    }

}