package com.action;

import com.po.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import com.service.UserServiceImpl;

import java.sql.Blob;

/**
 * Created by root on 16-9-19.
 */
public class AdminUserAdd extends ActionSupport {
    private String name;
    private String username;
    private boolean flag;
    private User user;
    private UserService userService;
    @Override
    public String execute() throws Exception {
        //剔除两端的空格
        name = name.trim();
        username = username.trim();
        //添加
        user.setUsername(username);
        user.setName(name);
        user.setFlag(flag);
        try {
            userService.addUser(user);
        } catch (Exception e) {
            throw new Exception("对不起，添加用户失败了，请更换用户名后再试试 ！");
        }
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
