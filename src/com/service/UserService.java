package com.service;

import com.po.User;
import java.util.List;

/**
 * Created by root on 16-9-30.
 */
public interface UserService {
    //得到所有用户
    public List<User> getUsers();
    //通过id得到用户
    public User getUserById(int id);
    //得到这个用户名的用户个数
    public int getUserByUsername(String username);
    //添加用户
    public void addUser(User u);
    //删除用户
    public void deleteUser(User u);
    //修改用户
    public void updateUser(User u);
    //注册用户
    public User login(String username, String password);
}
