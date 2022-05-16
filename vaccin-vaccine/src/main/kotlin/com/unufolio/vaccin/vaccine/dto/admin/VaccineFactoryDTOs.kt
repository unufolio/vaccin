package com.unufolio.vaccin.vaccine.dto.admin

import jakarta.validation.constraints.NotBlank

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
class CreateVaccineManufactureRequestDTO(
    @NotBlank(message = "VACCINE_MANUFACTURE_CODE_NOT_BLANK")
    val code: String? = null,
    @NotBlank(message = "VACCINE_MANUFACTURE_NAME_NOT_BLANK")
    val name: String? = null,
    val nameEn: String? = null,
    val shortName: String? = null,
    val shortNameEn: String? = null,
    val namePinyin: String? = null,
    val shortNamePinyin: String? = null
) {
    override fun toString(): String {
        return "CreateVaccineManufactureRequestDTO(code=$code, name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin)"
    }
}

class UpdateVaccineManufactureRequestDTO(
    @NotBlank(message = "VACCINE_MANUFACTURE_NAME_NOT_BLANK")
    val name: String? = null,
    val nameEn: String? = null,
    val shortName: String? = null,
    val shortNameEn: String? = null,
    val namePinyin: String? = null,
    val shortNamePinyin: String? = null
) {
    override fun toString(): String {
        return "UpdateVaccineManufactureRequestDTO(name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin)"
    }
}