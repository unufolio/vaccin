package com.unufolio.vaccin.vaccine.config

import jakarta.validation.Validation
import jakarta.validation.Validator
import org.hibernate.validator.HibernateValidator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/29
 */
@Configuration
class ValidateConfig {

    @Bean
    fun validator(): Validator {
        return Validation.byProvider(HibernateValidator::class.java)
            .configure() // 开启快速校验--默认校验所有参数，false 校验全部
            .addProperty("hibernate.validator.fail_fast", "true")
            .buildValidatorFactory().validator
    }
}