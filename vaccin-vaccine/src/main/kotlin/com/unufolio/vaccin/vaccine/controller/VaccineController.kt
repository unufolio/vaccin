package com.unufolio.vaccin.vaccine.controller

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.dataobject.VaccineDO
import com.unufolio.vaccin.vaccine.service.VaccineService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@RestController
@RequestMapping("vaccines")
class VaccineController(
    val vaccineService: VaccineService
) {

    @PostMapping("")
    fun create() {
        vaccineService.saveVaccine(VaccineDO())
    }

    @GetMapping("code/{code}")
    fun retrieve(@PathVariable("code") code: String): ResultEntity<VaccineDO> {

        val retrieve = vaccineService.retrieve()
        print(retrieve)

        val resultEntity = ResultEntity.success(VaccineDO())
        val data = resultEntity.data;
        println(data)
        return resultEntity
    }

    @DeleteMapping()
    fun delete() {
        vaccineService.delete()
    }

    @GetMapping("list")
    fun list(): ResultEntity<List<VaccineDO>> {
        return ResultEntity.success(ArrayList())
    }

    @GetMapping("page")
    fun page(): ResultEntity<List<VaccineDO>> {
        return ResultEntity.success(ArrayList())
    }


}