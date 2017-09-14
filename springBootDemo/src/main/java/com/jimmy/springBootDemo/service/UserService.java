package com.jimmy.springBootDemo.service;

import com.jimmy.springBootDemo.domain.User;

import java.util.List;

/**
 * author : jimmyLJM
 */

public interface UserService {

    /**
     * 创建用户
     * @param user
     */
    public void create(User user);

    /**
     * 获取用户总量
     * @return
     */
    public Integer getAllUser();

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 根据传入对象的属性查询User
     * @param user
     * @return
     */
    User getByUser(User user);

    User getByLoginName(String LoginName);

    /**
     * 根据传入对象的属性查询user列表
     * @param user
     * @return
     */
    List<User> getUserList(User user);

    /**
     *修改密码
     * @param password
     * @param newpassword
     */
    void  modifyPassword(Integer id, String  password,  String newpassword);

    /**
     * 根据传入对象修改User
     * @param user
     */
    void  updateUser(User user);
}
