package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

/**
 * Created by root on 16-10-18.
 */
public class GotoPromptDeleteUser extends ActionSupport {
    private int id;
    private String username;
    private UserService userService;
    @Override
    public String execute() throws Exception {
        User user=null;
        try {
            user=userService.getUserById(id);
        }catch (Exception e){
            throw new Exception("不好意思，好像出点问题！");
        }
        username=user.getUsername();
        return super.execute();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
