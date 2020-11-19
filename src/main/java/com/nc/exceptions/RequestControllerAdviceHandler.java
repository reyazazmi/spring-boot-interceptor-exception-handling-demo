package com.nc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RequestControllerAdviceHandler {

    @ExceptionHandler
    public ResponseEntity<String> invalidHeaderField(CustomInvalidHeaderFieldException fieldException){
        return new ResponseEntity<String>(fieldException.getMessage(), HttpStatus.FORBIDDEN);
    }

}
