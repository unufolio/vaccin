package com.unufolio.vaccin.vaccine.controller

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin.CreateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin.UpdateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.objectmapper.VaccineFactoryMapping
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@RestController("vaccine-factories")
class VaccineFactoryController(
    val vaccineFactoryService: VaccineFactoryService, val vaccineFactoryMapping: VaccineFactoryMapping
) {

    @PostMapping()
    fun create(
        @RequestBody @Valid requestDTO: CreateVaccineFactoryRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = vaccineFactoryMapping.map(requestDTO, VaccineFactoryDO::class.java)
        return ResultEntity.succeed();
    }

    @PostMapping("/{code}:offline")
    fun offline(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }

    @PostMapping("/{code}:online")
    fun online(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }

    @PutMapping("/{code}")
    fun update(
        @PathVariable("code") code: String, @RequestBody @Valid requestDTO: UpdateVaccineFactoryRequestDTO
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }

    @DeleteMapping("/{code}")
    fun delete(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return ResultEntity.succeed();
    }
}