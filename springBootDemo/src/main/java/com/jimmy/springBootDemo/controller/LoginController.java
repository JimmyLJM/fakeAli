package com.jimmy.springBootDemo.controller;

import com.jimmy.springBootDemo.service.UserService;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * author : jimmyLJM on 2017-09-07
 */
@Controller
public class LoginController {


    @Resource
    private UserService userService;

    @RequestMapping("/home")
    public String home() {
        return "home";

    }

//    @PreAuthorize("hasRole('user')")
    @RequestMapping(value = "/admin",method = RequestMethod.POST)
    public String toAdmin(){
        return "helloAdmin";
    }

    @RequestMapping("/hello")
    public String hello() {

        return "hello";

    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/")
    public String root() {
        return "index";

    }

    @RequestMapping("/403")
    public String error(){
        return "403";
    }
}
