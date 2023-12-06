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
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstname}</td>
            <td>${user.surname}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>


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
    </tr>
    </thead>
    <tbody>
    <form action="/users/delete" method="post">
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstname}</td>
                <td>${user.surname}</td>
                <td>${user.age}</td>
                <td>
                    <input type="number" value="${user.id}">
                    <input type="submit" value="Delete">
                </td>
            </tr>
        </c:forEach>
    </form>
    </tbody>
</table>
</body>
</html>


<html>
<head>
    <title>Users</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Firstname</th>
        <th>Surname</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.firstname}</td>
            <td>${user.surname}</td>
            <td>${user.age}</td>
            <td>
                <form action="/users/delete" method="post">
                    <input type="hidden" name="id" value="${user.id}">
                    <input type="submit" value="Delete">
                </form>
                <form action="/users/update" method="post">
                    <input type="hidden" name="id" value="${user.id}">
                    <input type="submit" value="Update">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

