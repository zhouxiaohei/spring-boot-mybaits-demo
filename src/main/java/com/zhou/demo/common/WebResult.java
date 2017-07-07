package com.zhou.demo.common;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 11:23 2017/7/5
 */
public class WebResult {
    private int code = 200;
    private String message = "success";
    private Object result;

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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
