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
        val vaccineFactoryDO = VaccineFactoryDO().apply {
            code = requestDTO.code
            name = requestDTO.name
            nameEn = requestDTO.nameEn
            namePinyin = requestDTO.namePinyin
            shortName = requestDTO.shortName
            shortNameEn = requestDTO.shortNameEn
            shortNamePinyin = requestDTO.shortNamePinyin
        }
        vaccineFactoryService.create(vaccineFactoryDO)
        return ResultEntity.succeed();
    }

    @GetMapping("{code}")
    fun retrieve(): ResultEntity<Void> {
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
        return ResultEntity.succeed();
    }

    @DeleteMapping("{code}")
    fun delete(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }
}