package com.jimmy.springBootDemo.exception;

import com.jimmy.springBootDemo.enums.ResultEnum;

/**
 * 自定义异常
 * author : jimmyLJM
 */
public class DemoException extends RuntimeException {

    private Integer code;

    public DemoException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
