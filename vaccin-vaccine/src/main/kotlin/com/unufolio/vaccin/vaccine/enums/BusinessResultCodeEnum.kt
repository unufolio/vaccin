package com.unufolio.vaccin.vaccine.enums

import com.unufolio.common.IResultCode

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/13
 */
enum class VaccineFactoryBusinessResultCodeEnum(private val value: String, private val message: String) : IResultCode {
    VACCINE_FACTORY_CODE_EXIST("", "vaccine factory code exist"),
    VACCINE_FACTORY_NAME_EXIST("", "vaccine factory name exist"),
    VACCINE_FACTORY_NOT_EXIST("", "vaccine factory not exist"),
    VACCINE_FACTORY_CREATE_FAILURE("", "vaccine factory create failure"),
    VACCINE_FACTORY_DELETE_FAILURE("", "vaccine factory delete failure"),
    VACCINE_FACTORY_UPDATE_FAILURE("", "vaccine factory update failure"),
    VACCINE_FACTORY_ONLINE_FAILURE("", "vaccine factory online failure"),
    VACCINE_FACTORY_OFFLINE_FAILURE("", "vaccine factory offline failure"),
    ;

    override fun value(): String? {
        return null
    }

    override fun message(): String? {
        return null
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