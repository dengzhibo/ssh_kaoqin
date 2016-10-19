<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="d" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>尚观培训学校考勤管理系统</title>
    <d:head></d:head>
</head>
<body>
<table width="80%" align="center">
    <tr><td align="center" colspan="6"><h1>尚观培训学校考勤管理系统</h1></td></tr>
    <tr><td width="15%" align="center" bgcolor="black"><a href="admin_user_manager"><h5><font color="white" >用户管理</font></h5></a></td>
        <td width="15%"  align="center" bgcolor="black"><a href="admin_course_mg.jsp"><h5><font color="white" >课程管理</font></h5></a></td>
        <td width="15%"  align="center" bgcolor="black"><a href="admin_class_mg.jsp"><h5><font color="white" >班级管理</font></h5></a></td>
        <td width="15%"  align="center" bgcolor="black"><a href="admin_mg.jsp"><h5><font color="white" >分班管理</font></h5></a></td>
        <td width="20%"  align="center" bgcolor="black"><a href="update_password.jsp?id=<s:property value="#session.user.id"></s:property> &pass=<s:property value="#session.user.password"></s:property> "><h5><font color="white" >修改(<s:property value="#session.user.name"></s:property>)密码</font></h5></a></td>
        <td width="20%"  align="center" bgcolor="black"><a href="logout.jsp"><h5><font color="white" >退出登陆</font></h5></a></td>
    </tr>
</table>
<hr width="80%" color="green">
<d:body></d:body>
<hr width="80%" color="green">
<table width="80%" align="center">
    <tr><td align="center"><h3>&copy尚观科技有限公司 2016.8.25 周清</h3></td></tr>
</table>
