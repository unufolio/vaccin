package com.unufolio.vaccin.vaccine.controller.admin

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dataobject.VaccineManufactureDO
import com.unufolio.vaccin.vaccine.dto.admin.CreateVaccineManufactureRequestDTO
import com.unufolio.vaccin.vaccine.dto.admin.UpdateVaccineManufactureRequestDTO
import com.unufolio.vaccin.vaccine.objectmapping.VaccineFactoryMapping
import com.unufolio.vaccin.vaccine.service.VaccineManufactureService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
@RestController("admin/vaccine-factories")
class AdminVaccineManufactureController(
    private val vaccineManufactureService: VaccineManufactureService,
) {

    @PostMapping()
    fun create(
        @RequestBody @Valid requestDTO: CreateVaccineManufactureRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryMapping.fromCreateDTOToDataObject(requestDTO)
        return vaccineManufactureService.create(vaccineFactoryDO)
    }

    @GetMapping("{code}")
    fun retrieve(@PathVariable(value = "code", required = true) code: String): ResultEntity<VaccineManufactureDO> {
        return vaccineManufactureService.retrieve(code)
    }

    @GetMapping("")
    fun list(@PathVariable(value = "code", required = true) code: String): ResultEntity<VaccineManufactureDO> {
        return vaccineManufactureService.retrieve(code)
    }

    @PostMapping("{code}:offline")
    fun offline(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return vaccineManufactureService.offline(code);
    }

    @PostMapping("{code}:online")
    fun online(
        @PathVariable("code") code: String
    ): ResultEntity<Void> {
        return vaccineManufactureService.online(code)
    }

    @PutMapping("{code}")
    fun update(
        @PathVariable("code") code: String,
        @RequestBody requestDTO: UpdateVaccineManufactureRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryMapping.fromUpdateDTOToDataObject(requestDTO)
        vaccineFactoryDO.code = code
        return vaccineManufactureService.update(vaccineFactoryDO)
    }

    @DeleteMapping("{code}")
    fun delete(
        @PathVariable(value = "code", required = true) code: String
    ): ResultEntity<Void> {
        return ResultEntity.success();
    }
}