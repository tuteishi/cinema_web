<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head> Registration</head>
<body>
<table>
    <thead>
    <tr>
        <th>Firstname</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Login</th>
        <th>Password</th>
    </tr>
    </thead>
    <tbody>
    <form action="/users/create" method="post">
        <tr>
            <td><input type="text" name="firstname" placeholder="Enter firstname"></td>
            <td><input type="text" name="surname" placeholder="Enter surname"></td>
            <td><input type="text" name="age" placeholder="Enter age"></td>
            <td><input type="text" name="login" placeholder="Enter login"></td>
            <td><input type="text" name="password" placeholder="Enter password"></td>
            <td><input type="submit" value="Registration"></td>
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
