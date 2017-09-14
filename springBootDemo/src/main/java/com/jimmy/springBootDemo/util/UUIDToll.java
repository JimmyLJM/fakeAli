package com.jimmy.springBootDemo.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * author : jimmyLJM on 2017-09-12
 */
public class UUIDToll {
    public static String getUUID(){
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
//        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
        return StringUtils.replace(s, "-", "");
    }
}
