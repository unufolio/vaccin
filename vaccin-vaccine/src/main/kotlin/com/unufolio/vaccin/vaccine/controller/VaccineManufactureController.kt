package com.unufolio.vaccin.vaccine.controller

import com.unufolio.vaccin.vaccine.service.VaccineManufactureService
import org.springframework.web.bind.annotation.RestController

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@RestController("vaccine-manufactures")
class VaccineManufactureController(
    val vaccineManufactureService: VaccineManufactureService
) {
}