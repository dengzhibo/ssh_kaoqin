<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<form action="admin_delete_user" method="post">
    <input type="hidden" name="id" value="<s:property value='id'/>">
    <table width="80%" border="0" align="center">
        <tr><th>您确定想删除(<s:property value="username"></s:property> )这个帐号？</th></tr>
        <tr><td align="center"><input type="submit" name="tj" value="   是   "> <input type="submit" name="tj" value="   否   "> </td></tr>
    </table>
</form>
</body>
</html>