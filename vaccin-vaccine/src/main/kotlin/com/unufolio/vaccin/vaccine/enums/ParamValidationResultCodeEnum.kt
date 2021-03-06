package com.unufolio.vaccin.vaccine.enums

import com.unufolio.common.IResultCode

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
enum class ParamValidationResultCodeEnum(private val value: String, private val message: String) : IResultCode {

    VACCINE_MANUFACTURE_CODE_NOT_BLANK("", "vaccine manufacture code not blank"),
    VACCINE_MANUFACTURE_NAME_NOT_BLANK("", "vaccine manufacture name not blank"),

    ;

    companion object {
        val map = values().associateBy { it.name }
    }

    override fun value(): String {
        return this.value
    }

    override fun message(): String {
        return this.message
    }

    override fun toString(): String {
        return "ParamValidationResultCodeEnum(value=$value, message=$message)"
    }

}