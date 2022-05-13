package com.unufolio.vaccin.vaccine.exception

import com.unufolio.common.ResultEntity
import com.unufolio.vaccin.vaccine.enums.ParamValidationResultCodeEnum
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.client.HttpClientErrorException.NotFound


/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
@RestControllerAdvice
class GlobalExceptionHandlers {

    private val logger: Logger = LoggerFactory.getLogger(GlobalExceptionHandlers::class.java)

    /**
     * 处理 Validator 异常
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = [MethodArgumentNotValidException::class])
    fun methodArgumentNotValidExceptionHandler(exception: MethodArgumentNotValidException): ResultEntity<Void> {
        logger.error("MethodArgumentNotValidException: ", exception)
        val result = exception.bindingResult
        val fieldError = result.fieldError
        val paramValidationResultCodeEnum = ParamValidationResultCodeEnum.map[fieldError!!.defaultMessage]
        return ResultEntity.failure(paramValidationResultCodeEnum);
    }

    @ExceptionHandler(value = [NotFound::class])
    fun exceptionHandler(exception: Exception): ResultEntity<Void> {
        logger.error("Exception: ", exception)
        return ResultEntity.failure(ResultEntity.failure());
    }
}