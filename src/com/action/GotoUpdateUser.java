package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

/**
 * Created by root on 16-10-18.
 */
public class GotoUpdateUser extends ActionSupport {
    private int id;
    private UserService userService;
    @Override
    public String execute() throws Exception {
        try {
            User user=userService.getUserById(id);
            ActionContext.getContext().getSession().put("updateuser",user);
        }catch (Exception e){
            throw new Exception("不好意思，好像出点问题！");
        }
        return super.execute();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
