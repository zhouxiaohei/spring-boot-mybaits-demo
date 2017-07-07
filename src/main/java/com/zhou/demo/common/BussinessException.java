package com.zhou.demo.common;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 16:28 2017/6/28
 */
public class BussinessException extends RuntimeException {

    private static final long serialVersionUID = -2020185599276671223L;

    private int code;
    private String message;

    public BussinessException( int code, String message, Throwable cause) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public BussinessException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BussinessException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
