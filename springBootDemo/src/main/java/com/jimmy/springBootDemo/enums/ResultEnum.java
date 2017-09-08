package com.jimmy.springBootDemo.enums;

/**
 * author : jimmyLJM
 */
public enum ResultEnum {
    UNKONW_ERRPR(-1,"系统错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"还在上小学"),
    PRIME_KEY_ISNULL(10,"业务主键为空"),
    MIDDLE_SCHOOL(101,"初中生")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
