<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<table align="center" border="0">
    <tr><td><s:fielderror style="color:red"></s:fielderror><s:actionerror style="color:red"></s:actionerror></td></tr>
</table>
<s:form action="login" method="post" theme="simple">
    <table border="1" align="center">
        <tr><td>账号：</td><td><s:textfield name="username"></s:textfield></td></tr>
        <tr><td>密码：</td><td><s:password  name="password"></s:password></td></tr>
        <tr><td>验证码：</td><td><s:textfield name="yzm"></s:textfield><img src="/yzm.zhq" onclick="this.src='/yzm.zhq?nm='+Math.random()" width="100" title="点击可以更换"></td></tr>
        <tr><td colspan="2" align="center">
            <s:submit value="登陆"></s:submit>
            <s:reset value="重置"></s:reset>
        </td></tr>
    </table>
</s:form>
</body>
</html>


