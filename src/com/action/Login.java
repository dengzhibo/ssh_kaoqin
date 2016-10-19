package com.action;
import com.po.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import com.service.UserServiceImpl;
/**
 * Created by root on 16-9-18.
 */
public class Login extends ActionSupport {
    private String username;
    private String password;
    private String yzm;
    private UserService userService;
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

    public String getYzm() {
        return yzm;
    }

    public void setYzm(String yzm) {
        this.yzm = yzm;
    }
    @Override
    public String execute() throws Exception {

        //剔除两端空格
        username=username.trim();
        password=password.trim();
        yzm=yzm.trim();
        //比对验证码
        String safecode=(String) ActionContext.getContext().getSession().get("safecode");
        if(yzm.equals(safecode)==false)//验证码错误
        {
            addFieldError("yzm","验证码错误！");//提示错误信息
            return INPUT;//返回到表单页面
        }
        //登录义务处理
        User user=null;
        try {
            user=userService.login(username,password);
        }catch (Exception e){
            throw new Exception("对不起，登录失败了！");
        }
        if(user!=null && user.getUsername()!=null && user.getPassword()!=null){
            ActionContext.getContext().getSession().put("user",user);
            if(true==user.isFlag()){
                return SUCCESS;
            }
            else{
                return "userview";
            }
        }
        else{
            addActionError("用户名或密码错误！");
            return INPUT;
        }
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
