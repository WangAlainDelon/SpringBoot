package com.wx.springboot.serviceimp;

import com.wx.springboot.dao.Userdao;
import com.wx.springboot.daoimp.UserDaoImp;
import com.wx.springboot.pojo.User;
import com.wx.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private Userdao userdao;
    @Override
    public int addUser(User user) {
        return userdao.addUser(user);
    }

    @Override
    public int updateUser(User account) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User findUserById(int id) {
        return userdao.findUserById(id);
    }

    @Override
    public List<User> findUserList() {

        return userdao.findUserList();
    }
}
