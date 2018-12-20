package com.group5.eleme.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BaseController {

    @ExceptionHandler(value = Exception.class)
    public String myselfException(Exception e) {
        return "error";
    }
}
