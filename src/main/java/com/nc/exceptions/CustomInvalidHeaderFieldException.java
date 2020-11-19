package com.nc.exceptions;

public class CustomInvalidHeaderFieldException  extends RuntimeException{
    private String message;


    public CustomInvalidHeaderFieldException() {
    }
    public CustomInvalidHeaderFieldException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
