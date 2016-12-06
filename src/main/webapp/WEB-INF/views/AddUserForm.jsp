<%--
  Created by IntelliJ IDEA.
  User: intern
  Date: 2016-12-05
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddUserForm</title>
</head>
<body>

<form id="adduser" action="AddUser" method="post">
    <label>아이디 : </label><input type="text" id="user_id_pk" name="user_id_pk"><br>
    <label>비밀번호 : </label><input type="password" id="user_pw" name="user_pw"><br>
    <label>이름 : </label><input type="text" id="user_name" name="user_name"><br>
    <label>이메일 : </label><input type="text" id="user_email" name="user_email"><br>
    <button type="submit">가입</button>
</form>
</body>
</html>
