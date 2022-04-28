package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.unufolio.vaccin.vaccine.dal.mapper.VaccineMapper
import com.unufolio.vaccin.vaccine.dal.repository.VaccineRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineDO
import org.springframework.stereotype.Repository

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Repository
class VaccineRepositoryImpl(val vaccineMapper: VaccineMapper) : VaccineRepository {

    override fun retrieve(): VaccineDO? {
        return vaccineMapper.selectById(4);
    }

    override fun save(vaccineDO: VaccineDO): Int {
        return vaccineMapper.insert(vaccineDO);
    }

    override fun delete(vaccineDO: VaccineDO): Int {
        val id = vaccineDO.id
        return vaccineMapper.deleteById(id);
    }

}