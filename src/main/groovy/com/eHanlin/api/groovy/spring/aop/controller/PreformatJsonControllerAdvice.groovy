package com.eHanlin.api.groovy.spring.aop.controller

import org.springframework.core.MethodParameter
import org.springframework.core.annotation.Order
import org.springframework.http.MediaType
import org.springframework.http.converter.json.MappingJacksonValue
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.AbstractMappingJacksonResponseBodyAdvice

/**
 * Encapsulate the result of controller
 */
@ControllerAdvice
@Order(0)
class PreformatJsonControllerAdvice extends AbstractMappingJacksonResponseBodyAdvice {

    @Override
    protected void beforeBodyWriteInternal(MappingJacksonValue bodyContainer,
                                           MediaType contentType,
                                           MethodParameter returnType,
                                           ServerHttpRequest request,
                                           ServerHttpResponse response)
    {
        if (bodyContainer.value instanceof Throwable) {
            bodyContainer.setValue([success: false, errMsg: bodyContainer.value.message])
        } else {
            bodyContainer.setValue([success: true, result: bodyContainer.value])
        }
    }

}
