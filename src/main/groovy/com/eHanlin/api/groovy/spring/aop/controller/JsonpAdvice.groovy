package com.eHanlin.api.groovy.spring.aop.controller

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice

/**
 * Spring Boot JSONP support
 */
@ControllerAdvice
class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {
        super("jsonp", "callback")
    }

}
