package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.unufolio.vaccin.vaccine.dal.mapper.VaccineMapper
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import org.springframework.stereotype.Repository

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Repository
class VaccineFactoryRepositoryImpl(val vaccineMapper: VaccineMapper) : VaccineFactoryRepository {

}