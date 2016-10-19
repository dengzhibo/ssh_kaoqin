<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<table width="80%" border="0" align="center">
    <tr><td><h4>位置：用户管理</h4></td></tr>
</table>
<table width="80%" border="1" align="center">
    <tr><th colspan="5"><a href="admin_go_adduser.action">添加用户</a> </th></tr>
    <tr><th>帐号</th><th>姓名</th><th>权限</th><th>修改</th><th>删除</th></tr>
    <s:iterator value="users" id="u" status="st">
        <s:if test="#st.odd">
            <tr bgcolor="yellow"><td><s:property value="#u.username"></s:property>
            </td><td><s:property value="#u.name"></s:property></td><td>
                <s:if test="#u.flag">
                    管理员
                </s:if>
                <s:else>
                    普通用户
                </s:else>
            </td><td>
                <a href="admin_go_updateuser.action?id=<s:property value="#u.id"></s:property> ">修改</a>
            </td><td>
                <a href="admin_go_deleteuser.action?id=<s:property value="#u.id"></s:property> ">删除</a>
                </td></tr>
        </s:if>
        <s:else>
            <tr bgcolor="#7fffd4"><td><s:property value="#u.username"></s:property>
            </td><td><s:property value="#u.name"></s:property></td><td>
                <s:if test="#u.flag">
                    管理员
                </s:if>
                <s:else>
                    普通用户
                </s:else>
            </td><td>
                <a href="admin_go_updateuser.action?id=<s:property value="#u.id"></s:property> ">修改</a>
            </td><td>
                <a href="admin_go_deleteuser.action?id=<s:property value="#u.id"></s:property> ">删除</a>
            </td></tr>
        </s:else>
    </s:iterator>
</table>
</body>
</html>
