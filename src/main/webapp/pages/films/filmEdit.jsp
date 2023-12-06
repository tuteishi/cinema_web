<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit films page</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Show date</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="film" items="${films}">
        <tr>
            <td>${film.name}</td>
            <td>${film.showDate}</td>

            <form action="/films/delete" method="get">
                <input type="hidden" name="id" value="${film.getId()}">
                <input type="hidden" name="name" value="${film.getName()}">
                <input type="hidden" name="showDate" value="${film.getShowDate()}">
                <td><input type="submit" value="Delete"></td>
            </form>
            <form action="/films/update" method="get">
                <input type="hidden" name="id" value="${film.getId()}">
                <input type="hidden" name="name" value="${film.getName()}">
                <input type="hidden" name="showDate" value="${film.getShowDate()}">
                <td><input type="submit" value="Update"></td>
            </form>
        </tr>
    </c:forEach>
    <form action="/pages/films/filmCreate.jsp" method="post">
        <tr>
            <td><input type="submit" value="Create new film"></td>
        </tr>
    </form>
    <form action="/films/read" method="post">
        <tr>
            <td><input type="submit" value="Back"></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
