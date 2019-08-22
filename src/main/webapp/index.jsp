<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>


<form action="${pageContext.request.contextPath}/showClient.do">
    输入客户编号查询<br>
    <input name="id">
    <input type="submit" value="查询">
</form>
<hr>
<h1>增加客户信息：</h1>
<form action="${pageContext.request.contextPath}/addClient.do">
    客户姓名：<input name="cltName"><br>
    客户编号：<input name="cltNo"><br>
    客户地址：<input name="cltAddr"><br>
    客户电话：<input name="cltTel"><br>
    客户邮箱：<input name="cltEmail"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
