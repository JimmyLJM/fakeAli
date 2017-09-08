package com.jimmy.springBootDemo.vo;

/**
 * http请求返回的最外层信息
 * author : jimmyLJM
 * @param <T>
 */
public class Result<T> {

    private Integer code;       // 状态码
    private String message;    //  返回信息
    private T data;            //  返回数据

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
