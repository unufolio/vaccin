package com.unufolio.vaccin.common.rpc;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public enum ResultCodeEnum implements IResultCode {

    // Success
    SUCCESS("120000", "success"),
    ERROR("150000", "error"),
    ;
    private final String value;
    private final String message;

    ResultCodeEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    @Override
    public String value() {
        return this.value;
    }

    @Override
    public String message() {
        return this.message;
    }

    @Override
    public String toString() {
        return "ResultCodeEnum{" +
                "value='" + value + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}