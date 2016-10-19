<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <script src="../../jquery-3.0.0.min.js"></script>
    <script src="../../py.js"></script>
</head>
<body>

<table width="80%" border="0" align="center">
    <tr><td><h4>位置：<a href="admin_mg.jsp">用户管理</a>->添加用户</h4></td></tr>
</table>
<table align="center" border="0">
    <tr><td><s:fielderror style="color:red"></s:fielderror><s:actionerror style="color:red"></s:actionerror></td></tr>
</table>
<s:form action="admin_add_user" method="POST" theme="simple">
    <table width="80%" border="1" align="center">
        <tr><td align="right" width="50%">姓名</td><td><input name="name" id="name" oninput="create_user(this.value)" ></td></tr>
        <tr><td align="right">登录帐号</td><td><input name="username" id="username" readonly maxlength="20"><input type="button" value="检测帐号" onclick="check_user()"> </td></tr>
        <tr><td align="right">权限</td><td><input type="radio" name="flag" value="true">管理员<input type="radio" name="flag" checked value="false">普通用户</td></tr>
        <tr><td align="center" colspan="2"><input type="submit" value="确定添加"><input type="reset" value="重置"></td></tr>
    </table>
</s:form>
<script>
    function check_user() {
        $.ajax({
            type: "GET",
            url: "checkusername",
            data: {username:$("#username").val()},
            dataType: "json",
            success: function(data){
                if(data.count>0){
                    alert("这个帐号已经存在！");
                }
                else if(data.count==0){
                    alert("这个帐号可以使用！");
                }
                else{
                    alert("这个帐号无法确定，请稍后再试！");
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("无法确定用户的存在！");
            }
        });

    }
    function create_user(v) {
        var str=codefans_net_CC2PY(v);
        str=str.toLowerCase();
        document.getElementsByName("username")[0].value=str;
    }
</script>
</body>
</html>
