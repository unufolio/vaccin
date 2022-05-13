package com.unufolio.vaccin.vaccine.enums

import com.unufolio.common.IResultCode

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
enum class ParamValidationResultCodeEnum(private val value: String, private val message: String) : IResultCode {

    VACCINE_FACTORY_CODE_NOT_BLANK("4001001", "vaccine factory code not blank"),
    VACCINE_FACTORY_NAME_NOT_BLANK("4001002", "vaccine factory name not blank"),

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