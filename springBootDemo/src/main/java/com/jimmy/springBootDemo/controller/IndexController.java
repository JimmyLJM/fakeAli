package com.jimmy.springBootDemo.controller;

import com.jimmy.springBootDemo.domain.User;
import com.jimmy.springBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * author : jimmyLJM
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping(value={"/","/index"})
    public String index(ModelMap map){
//        map.addAttribute("mes","Hello FreeMarker");
         List<User> userList = userService.getUserList(new User());
         map.addAttribute("userList",userList);
        return "index";
    }



}
