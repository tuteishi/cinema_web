<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head> Update user page</head>
<body>
<form action="/users/update" method="post">
    <input type="hidden" name="id" value="${param.id}">
    <input type="text" name="firstname" value="${param.firstname}">
    <input type="text" name="surname" value="${param.surname}">
    <input type="text" name="age" value="${param.age}">
    <input type="text" name="login" value="${param.login}">
    <input type="text" name="password" value="${param.password}">
    <input type="submit" value="Update">
</form>
</body>
</html>
