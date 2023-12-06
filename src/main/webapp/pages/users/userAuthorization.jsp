<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>Authorization</head>
<body>
<table>
    <thead>
    <tr>
        <th>Login</th>
        <th>Password</th>
    </tr>
    </thead>
    <tbody>
    <form action="/users/authorization" method="post">
        <tr>
            <td><input type="text" name="login" placeholder="Enter login"></td>
            <td><input type="text" name="password" placeholder="Enter password"></td>
            <td><input type="submit" value="Authorization"></td>
        </tr>
    </form>
    <form action="http://localhost:8080/index.jsp" method="post">
        <tr>
            <td><input type="submit" value="Back"></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
