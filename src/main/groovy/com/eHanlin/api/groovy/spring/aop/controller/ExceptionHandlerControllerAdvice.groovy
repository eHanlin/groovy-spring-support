package com.eHanlin.api.groovy.spring.aop.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * Default Rest Controller Exception Handler, just throws to the next advice.
 */
@ControllerAdvice(annotations = RestController)
class ExceptionHandlerControllerAdvice {

    @ExceptionHandler(Throwable)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    Throwable handleException(Throwable throwable) {
        throwable
    }

}
