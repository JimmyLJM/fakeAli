package com.jimmy.springBootDemo.controller;

import com.jimmy.springBootDemo.config.basic.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author : jimmyLJM on 2017-09-07
 */
@Controller
public class LoginController extends BaseController{


    /**
     *
     * @return
     */
    @GetMapping("/login")
    public String Login(HttpServletRequest request, HttpServletResponse response){
        // 判断是否已经登录，若已经登录则跳转至登录成功方法否则返回登录页

//        return "redirect:" + index;

        return "login";
    }

    /**
     *
     * @return
     */
    @PostMapping({"/","/index"})
    public String Login(){
        return "login";
    }



    @GetMapping("/logOut")
    public String logOut(){
        // 清除session信息

        return "login";
    }
}
