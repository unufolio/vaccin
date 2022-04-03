package com.unufolio.vaccin.vaccine

import com.unufolio.common.ResultEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vaccin.vaccine.dataobject.VaccineDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@RestController
@RequestMapping("vaccines")
class VaccineController {

    @GetMapping("code/{code}")
    fun retrieve(@PathVariable("code") code: String): ResultEntity<VaccineDO> {
        val resultEntity = ResultEntity.succeed(VaccineDO())
        val data = resultEntity.data;
        println(data)
        return resultEntity
    }

    @GetMapping("list")
    fun list(): ResultEntity<List<VaccineDO>> {
        return ResultEntity.succeed(ArrayList())
    }

    @GetMapping("page")
    fun page(): ResultEntity<List<VaccineDO>> {
        return ResultEntity.succeed(ArrayList())
    }


}