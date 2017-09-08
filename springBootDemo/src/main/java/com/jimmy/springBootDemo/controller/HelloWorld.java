package com.jimmy.springBootDemo.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jimmy.springBootDemo.domain.User;
import com.jimmy.springBootDemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * author : jimmyLJM
 */
@RestController
@Api(value = "测试类",tags = "测试接口")
public class HelloWorld {

    @Autowired
    private UserService userService;

    @ApiOperation(value="hello world,入门", notes="")
    @GetMapping(value = "/hi")
    public String sayHello() {
        return  "Hello World!";
    }

    @RequestMapping("/mybatis/page")
    public String findUserPageFromMybatis(HttpServletRequest request, Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 2 : pageNum;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<User> list =  userService.getUserList(new User());
        PageInfo pageInfo = new PageInfo(list);
        Page page = (Page) list;
//        return JSON.toJSONString(page);
        return "PageInfo: " + JSON.toJSONString(pageInfo) + ", Page: " + JSON.toJSONString(page);
    }


}
