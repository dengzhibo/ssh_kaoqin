package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

/**
 * Created by root on 16-10-18.
 */
public class AdminUserUpdate extends ActionSupport {
    private int id;
    private String name;
    private String username;
    private String password;
    private boolean flag;
    private UserService userService;
    @Override
    public String execute() throws Exception {
        try {
            User user=userService.getUserById(id);
            user.setName(name);
            user.setUsername(username);
            user.setPassword(password);
            user.setFlag(flag);
            userService.updateUser(user);
        }catch (Exception e){
            throw new Exception("对不起，修改用户失败！");
        }
        return super.execute();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
