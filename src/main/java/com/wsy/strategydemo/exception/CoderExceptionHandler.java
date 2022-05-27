package com.wsy.strategydemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CoderExceptionHandler {

    @ExceptionHandler(value = CoderException.class)
    @ResponseBody
    public String vaildExceptionHandler(CoderException e) {
        return e.getMsg();
    }
}
