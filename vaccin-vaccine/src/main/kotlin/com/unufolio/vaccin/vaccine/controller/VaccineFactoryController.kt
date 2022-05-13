package com.unufolio.vaccin.vaccine.controller

import com.unufolio.vaccin.vaccine.service.VaccineFactoryService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@RestController()
@RequestMapping("vaccine-factories")
class VaccineFactoryController(
    val vaccineFactoryService: VaccineFactoryService
) {
}