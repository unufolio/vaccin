package com.unufolio.vaccin.vaccine.service.impl

import com.unufolio.vaccin.vaccine.dal.repository.VaccineRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineDO
import com.unufolio.vaccin.vaccine.service.VaccineService
import org.springframework.stereotype.Service
import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@Service
class VaccineServiceImpl(val vaccineRepository: VaccineRepository) : VaccineService {

    override fun retrieve(): VaccineDO? {
        return vaccineRepository.retrieve()
    }

    override fun saveVaccine(): Int {
        val vaccineDO = VaccineDO()
        vaccineRepository.save(vaccineDO)
        print(vaccineDO)
        return 0
    }

    override fun delete(): Int {
        val vaccineDO = VaccineDO()
        vaccineRepository.delete(vaccineDO)
        print(vaccineDO)
        return 0
    }

}