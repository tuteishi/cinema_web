<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Firstname</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Login</th>
        <th>Password</th>
        <th>Role</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstname}</td>
            <td>${user.surname}</td>
            <td>${user.age}</td>
            <td>${user.login}</td>
            <td>${user.password}</td>
            <td>${user.userRole}</td>
            <td>
                <form action="/users/delete" method="get">
                    <input type="hidden" name="id" value="${user.getId()}">
                    <input type="hidden" name="firstname" value="${user.getFirstname()}">
                    <input type="hidden" name="surname" value="${user.getSurname()}">
                    <input type="hidden" name="age" value="${user.getAge()}">
                    <input type="submit" value="Delete" style="float:right">
                </form>
                <form action="/users/update" method="get">
                    <input type="hidden" name="id" value="${user.getId()}">
                    <input type="hidden" name="firstname" value="${user.getFirstname()}">
                    <input type="hidden" name="surname" value="${user.getSurname()}">
                    <input type="hidden" name="age" value="${user.getAge()}">
                    <input type="hidden" name="login" value="${user.getLogin()}">
                    <input type="hidden" name="password" value="${user.getPassword()}">
                    <input type="submit" value="Update" style="float:right">
                </form>
            </td>
        </tr>
    </c:forEach>
    <form action="/pages/menu.jsp" method="post">
        <tr>
            <td><input type="submit" value="Back"></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
