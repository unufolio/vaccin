package com.unufolio.vaccin.vaccine.controller.admin

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.CreateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.UpdateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.objectmapper.VaccineFactoryMapping
import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import org.springframework.web.bind.annotation.*

/**
 * @author yeke yeke@healthych.com
 * @since 2022/04/28
 */
class AdminVaccineFactoryController(
    private val vaccineFactoryService: VaccineFactoryService,
    private val vaccineFactoryMapping: VaccineFactoryMapping
) {

    @PostMapping()
    fun create(
        @RequestBody requestDTO: CreateVaccineFactoryRequestDTO
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
        @PathVariable("code") code: String,
        @RequestBody requestDTO: UpdateVaccineFactoryRequestDTO
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