package com.jimmy.springBootDemo.controller;

import com.jimmy.springBootDemo.util.ResultUtil;
import com.jimmy.springBootDemo.vo.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : jimmyLJM on 2017-09-14
 */
@RestController
public class ProController {

    @Value("${mymail.host}")
    private String host;

    @GetMapping("/TestRead")
    public Result TestRead(){
        return ResultUtil.success(host);
    }
}
