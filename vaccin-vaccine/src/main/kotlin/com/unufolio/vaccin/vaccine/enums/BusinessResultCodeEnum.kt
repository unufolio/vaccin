package com.unufolio.vaccin.vaccine.enums

import com.unufolio.common.IResultCode

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/13
 */
enum class VaccineManufactureBusinessResultCodeEnum(private val value: String, private val message: String) : IResultCode {
    VACCINE_MANUFACTURE_CODE_EXIST("", "vaccine manufacture code exist"),
    VACCINE_MANUFACTURE_NAME_EXIST("", "vaccine manufacture name exist"),
    VACCINE_MANUFACTURE_NOT_EXIST("", "vaccine manufacture not exist"),
    VACCINE_MANUFACTURE_CREATE_FAILURE("", "vaccine manufacture create failure"),
    VACCINE_MANUFACTURE_DELETE_FAILURE("", "vaccine manufacture delete failure"),
    VACCINE_MANUFACTURE_UPDATE_FAILURE("", "vaccine manufacture update failure"),
    VACCINE_MANUFACTURE_ONLINE_FAILURE("", "vaccine manufacture online failure"),
    VACCINE_MANUFACTURE_OFFLINE_FAILURE("", "vaccine manufacture offline failure"),
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