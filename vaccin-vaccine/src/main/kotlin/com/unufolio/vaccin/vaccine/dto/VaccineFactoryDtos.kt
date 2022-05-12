package com.unufolio.vaccin.vaccine.dto

import jakarta.validation.constraints.NotBlank

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
class CreateVaccineFactoryRequestDTO(
    @NotBlank(message = "VACCINE_FACTORY_CODE_NOT_BLANK")
    private val code: String? = null,
    @NotBlank(message = "VACCINE_FACTORY_NAME_NOT_BLANK")
    private val name: String? = null,
    private val nameEn: String? = null,
    private val shortName: String? = null,
    private val shortNameEn: String? = null,
    private val namePinyin: String? = null,
    private val shortNamePinyin: String? = null
) {
    override fun toString(): String {
        return "CreateVaccineFactoryRequestDTO(code=$code, name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin)"
    }
}

class UpdateVaccineFactoryRequestDTO(
    @NotBlank(message = "VACCINE_FACTORY_NAME_NOT_BLANK")
    private val name: String? = null,
    private val nameEn: String? = null,
    private val shortName: String? = null,
    private val shortNameEn: String? = null,
    private val namePinyin: String? = null,
    private val shortNamePinyin: String? = null
) {
    override fun toString(): String {
        return "UpdateVaccineFactoryRequestDTO(name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin)"
    }
}