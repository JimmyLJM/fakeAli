package com.jimmy.springBootDemo.mapper;

import com.jimmy.springBootDemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * author : jimmyLJM
 */
@Mapper
@Component
public interface UserMapper {

    public User  createUser(@Param("model") User user);                       // 新增user
    public User  getById(@Param("id") Integer id);                                    // 根据id查询user
    public void  updateUser(@Param("model") User user);                     // 修改user
    public List<User> searchList(@Param("model") User user);             // 查询列表
    public List<User> queryForPage(@Param("model") User user);     // 分页查询
    public void deleteById(@Param("id") Integer id);                              // 根据主键删除
    public User getByLoginName(@Param("LoginName")String LoginName);
}
