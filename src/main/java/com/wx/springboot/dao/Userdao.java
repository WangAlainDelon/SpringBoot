package com.wx.springboot.dao;

import com.wx.springboot.pojo.User;

import java.util.List;

public interface Userdao {
    int addUser(User user);

    int updateUser(User account);

    int deleteUser(int id);

    User findUserById(int id);

    List<User> findUserList();

}
