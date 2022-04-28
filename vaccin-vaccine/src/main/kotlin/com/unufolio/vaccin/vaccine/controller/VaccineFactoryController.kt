package com.unufolio.vaccin.vaccine.controller

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin.CreateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin.UpdateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.objectmapping.VaccineFactoryMapping
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@RestController("vaccine-factories")
class VaccineFactoryController(
    val vaccineFactoryService: VaccineFactoryService
) {
}