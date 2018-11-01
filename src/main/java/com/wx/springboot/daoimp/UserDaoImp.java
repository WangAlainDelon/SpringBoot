package com.wx.springboot.daoimp;

import com.wx.springboot.dao.Userdao;
import com.wx.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements Userdao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int addUser(User user) {
        return jdbcTemplate.update("insert into user(name, age,addr) values(?, ?,?)",
                user.getName(),user.getAge(),user.getAddr());
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
        List<User> list = jdbcTemplate.query("select * from user where id = ?", new Object[]{id}, new BeanPropertyRowMapper<User>(User.class));
        if(list!=null && list.size()>0){
            User user = list.get(0);
            return user;
        }else{
            return null;
        }
    }
    @Override
    public List<User> findUserList() {

        List<User> list = jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper(User.class));
        if (list!=null&&list.size()>0)
        {
            return list;
        }
        else {
            return null;
        }
    }
}
