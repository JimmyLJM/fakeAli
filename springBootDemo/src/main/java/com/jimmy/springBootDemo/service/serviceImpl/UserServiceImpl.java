package com.jimmy.springBootDemo.service.serviceImpl;

import com.jimmy.springBootDemo.mapper.UserMapper;
import com.jimmy.springBootDemo.domain.User;
import com.jimmy.springBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author : jimmyLJM
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(User user) {
        userMapper.createUser(user);
    }

    @Override
    public Integer getAllUser() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public User getByUser(User user) {
        return null;
    }

    @Override
    public List<User> getUserList(User user) {
        return userMapper.searchList(user);
    }

    @Override
    public void modifyPassword(Integer id, String password, String newpassword) {

    }

    @Override
    public void updateUser(User user) {

    }
}
