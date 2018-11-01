package com.wx.springboot.controller;

import com.wx.springboot.pojo.User;
import com.wx.springboot.service.UserService;
import com.wx.springboot.serviceimp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    /*
      测试jdbcTemplate访问数据库
     */
    @Autowired
    private UserService userService;
    @RequestMapping("/user/findbyid/{id}")
    public User show(@PathVariable Integer id)
    {
        return userService.findUserById(id);
    }

    @RequestMapping("/user/add")
    public int addUser()
    {
        User user=new User();
        user.setAge(12);
        user.setName("赵六");
        user.setAddr("湖南");
        int i = userService.addUser(user);
        return i;
    }
    @RequestMapping("/user/findall")
    public List<User> getListUser()
    {
        List<User> userList = userService.findUserList();
        return userList;
    }
}
