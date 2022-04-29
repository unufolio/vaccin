package com.unufolio.vaccin.vaccine.controller.admin

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
 * @since 2022/04/28
 */
@RestController("admin/vaccine-factories")
class AdminVaccineFactoryController(
    private val vaccineFactoryService: VaccineFactoryService,
) {

    @PostMapping()
    fun create(
        @RequestBody @Valid requestDTO: CreateVaccineFactoryRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryMapping.fromCreateDTOToDataObject(requestDTO)
        vaccineFactoryService.create(vaccineFactoryDO)
        return ResultEntity.succeed();
    }

    @GetMapping("{code}")
    fun retrieve(@PathVariable("code") code: String): ResultEntity<Void> {
        return ResultEntity.succeed();
    }

    @PostMapping("{code}:offline")
    fun offline(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }

    @PostMapping("{code}:online")
    fun online(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }

    @PutMapping("{code}")
    fun update(
        @PathVariable("code") code: String,
        @RequestBody requestDTO: UpdateVaccineFactoryRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryMapping.fromUpdateDTOToDataObject(requestDTO)
        vaccineFactoryDO.code = code
        return ResultEntity.succeed();
    }

    @DeleteMapping("{code}")
    fun delete(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }
}