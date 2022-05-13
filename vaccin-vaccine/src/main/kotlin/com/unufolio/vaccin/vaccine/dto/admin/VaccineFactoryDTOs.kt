package com.unufolio.vaccin.vaccine.dto

import jakarta.validation.constraints.NotBlank

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
class CreateVaccineFactoryRequestDTO(
    @NotBlank(message = "VACCINE_FACTORY_CODE_NOT_BLANK")
    val code: String? = null,
    @NotBlank(message = "VACCINE_FACTORY_NAME_NOT_BLANK")
    val name: String? = null,
    val nameEn: String? = null,
    val shortName: String? = null,
    val shortNameEn: String? = null,
    val namePinyin: String? = null,
    val shortNamePinyin: String? = null
) {
    override fun toString(): String {
        return "CreateVaccineFactoryRequestDTO(code=$code, name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin)"
    }
}

class UpdateVaccineFactoryRequestDTO(
    @NotBlank(message = "VACCINE_FACTORY_NAME_NOT_BLANK")
    val name: String? = null,
    val nameEn: String? = null,
    val shortName: String? = null,
    val shortNameEn: String? = null,
    val namePinyin: String? = null,
    val shortNamePinyin: String? = null
) {
    override fun toString(): String {
        return "UpdateVaccineFactoryRequestDTO(name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin)"
    }
}