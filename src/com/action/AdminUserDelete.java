package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;
import com.sun.org.apache.bcel.internal.classfile.SourceFile;

/**
 * Created by root on 16-10-18.
 */
public class AdminUserDelete extends ActionSupport {
    private int id;
    private String tj;
    private UserService userService;
    @Override
    public String execute() throws Exception {
        tj=tj.trim();
        if(tj.equals("是")){
            try {
                System.out.println(id);
                User user=userService.getUserById(id);
                userService.deleteUser(user);
            }catch (Exception e){
                throw new Exception("对不起，删除用户失败！");
            }
        }
        else{
            return "back";
        }
        return super.execute();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTj() {
        return tj;
    }

    public void setTj(String tj) {
        this.tj = tj;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
