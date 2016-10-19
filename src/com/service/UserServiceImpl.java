package com.service;

import com.dao.UserDao;
import com.po.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by root on 16-8-26.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    //返回所有用户
    public List<User> getUsers(){
        return userDao.getUsers();
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    public int getUserByUsername(String username){
        return userDao.getUserByUsername(username);
    }
    public void addUser(User u){
        userDao.addUser(u);
    }
    public void deleteUser(User u){
        userDao.deleteUser(u);
    }
    public void updateUser(User u){
        userDao.updateUser(u);
    }
    public User login(String username,String password) {
        return userDao.getUserByUnameAndUpass(username,password);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
