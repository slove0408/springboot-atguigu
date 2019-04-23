package com.sxg.springboot.exception;

@SuppressWarnings("ALL")

public class MyException extends RuntimeException {

    private String message;
    private Integer code;

    public MyException() {
    }

    public MyException(String message) {
        this.message = message;
    }

    public MyException(String message,Integer code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
