package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import com.service.UserServiceImpl;

/**
 * Created by root on 16-9-19.
 */
public class CheckUsername extends ActionSupport {
    private UserService userService;
    private String username;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute() throws Exception {
        username=username.trim();
        count=userService.getUserByUsername(username);
        return super.execute();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
