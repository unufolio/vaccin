package com.unufolio.vaccin.vaccine.enums

import com.unufolio.common.IResultCode

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/13
 */
enum class VaccineFactoryBusinessResultCodeEnum(private val value: String, private val message: String) : IResultCode {
    VACCINE_FACTORY_CODE_EXIST("B4000001", "vaccine factory code exist"),
    VACCINE_FACTORY_NAME_EXIST("B4000002", "vaccine factory name exist"),
    VACCINE_FACTORY_NOT_EXIST("B4000003", "vaccine factory not exist"),
    VACCINE_FACTORY_CREATE_FAILURE("B4000004", "vaccine factory create failure"),
    VACCINE_FACTORY_DELETE_FAILURE("B4000005", "vaccine factory delete failure"),
    VACCINE_FACTORY_UPDATE_FAILURE("B4000006", "vaccine factory update failure"),
    ;

    override fun value(): String? {
        return value
    }

    override fun message(): String? {
        return message
    }
}

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/13
 */
enum class VaccineBusinessResultCodeEnum : IResultCode {
    ;

    override fun value(): String? {
        return null
    }

    override fun message(): String? {
        return null
    }
}