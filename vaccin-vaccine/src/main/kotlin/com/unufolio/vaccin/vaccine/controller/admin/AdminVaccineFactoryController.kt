package com.unufolio.vaccin.vaccine.controller.admin

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.dto.admin.CreateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.dto.admin.UpdateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.objectmapping.VaccineFactoryMapping
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
@RestController()
@RequestMapping("admin/vaccine-factories")
class AdminVaccineFactoryController(
    private val vaccineFactoryService: VaccineFactoryService,
) {

    @PostMapping("")
    fun create(
        @RequestBody @Valid requestDTO: CreateVaccineFactoryRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryMapping.fromCreateDTOToDataObject(requestDTO)
        return vaccineFactoryService.create(vaccineFactoryDO)
    }

    @GetMapping("{code}")
    fun retrieve(@PathVariable(value = "code", required = true) code: String): ResultEntity<VaccineFactoryDO> {
        return vaccineFactoryService.retrieve(code)
    }

    @GetMapping("")
    fun list(vaccineFactoryDO: VaccineFactoryDO): ResultEntity<List<VaccineFactoryDO>> {
        return ResultEntity.success(vaccineFactoryService.list(vaccineFactoryDO))
    }

    @PutMapping("{code}")
    fun update(
        @PathVariable("code") code: String,
        @RequestBody requestDTO: UpdateVaccineFactoryRequestDTO
    ): ResultEntity<Void> {
        val vaccineFactoryDO = VaccineFactoryMapping.fromUpdateDTOToDataObject(requestDTO)
        vaccineFactoryDO.code = code
        return vaccineFactoryService.update(vaccineFactoryDO)
    }

    @DeleteMapping("{code}")
    fun delete(
        @PathVariable(value = "code", required = true) code: String
    ): ResultEntity<Void> {
        return ResultEntity.success();
    }
}