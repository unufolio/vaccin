package com.unufolio.vaccin.vaccine.service.impl

import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import org.springframework.stereotype.Service

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Service
class VaccineFactoryServiceImpl(val vaccineFactoryRepository: VaccineFactoryRepository) : VaccineFactoryService {

    override fun deleteVaccineFactory() {
        TODO("Not yet implemented")
    }

}