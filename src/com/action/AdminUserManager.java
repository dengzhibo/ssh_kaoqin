package com.action;

import com.po.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import com.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16-9-19.
 */
public class AdminUserManager extends ActionSupport {
    private UserService userService;
    private List<User> users=new ArrayList<>();
    @Override
    public String execute() throws Exception {
        try {
            users = userService.getUsers();
        }catch (Exception e){
            throw new Exception("不好意思，好像出点问题！");
        }
        return SUCCESS;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
