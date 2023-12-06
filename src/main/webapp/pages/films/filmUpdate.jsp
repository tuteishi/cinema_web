<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head> Update film page</head>
<body>
<form action="/films/update" method="post">
    <input type="hidden" name="id" value="${param.id}">
    <input type="text" name="name" value="${param.name}">
    <input type="text" name="showDate" value="${param.showDate}">
    <input type="submit" value="Update">
</form>
</body>
</html>
