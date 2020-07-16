package com.staff.pojo;

import java.io.Serializable;

public class OperationError implements Serializable {

    private int code = 500;

    private String message;

    private String msg;

    public OperationError(String message) {
        this.message = message;
    }

    public OperationError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public OperationError(int code, String message, String msg) {
        this.code = code;
        this.message = message;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "OperationError{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
