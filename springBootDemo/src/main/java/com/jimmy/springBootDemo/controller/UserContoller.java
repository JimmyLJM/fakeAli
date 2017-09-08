package com.jimmy.springBootDemo.controller;

import com.jimmy.springBootDemo.domain.User;
import com.jimmy.springBootDemo.service.UserService;
import com.jimmy.springBootDemo.util.ResultUtil;
import com.jimmy.springBootDemo.vo.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : jimmyLJM on 2017-09-02
 */
@RestController
public class UserContoller {

    @Autowired
    private UserService userService;

    @ApiOperation(value="根据id获取信息", notes="id为主键")
    @GetMapping("/user/{id}")
    public Result  getUserById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        return ResultUtil.success(user);
    }
}
