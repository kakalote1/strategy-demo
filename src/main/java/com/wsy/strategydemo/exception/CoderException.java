package com.wsy.strategydemo.exception;

public class CoderException extends RuntimeException {

    private String msg;

    public CoderException(String msg) {
        super(msg);
        System.out.println(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
