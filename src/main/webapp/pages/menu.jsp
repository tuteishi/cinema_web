<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head> Make a choice </head>
<body>
<form action="/users/read" method="post">
    <tr>
        <td><input type="submit" value="View users"></td>
    </tr>
</form>
<form action="/films/read" method="post">
    <tr>
        <td><input type="submit" value="View films" ></td>
    </tr>
</form>
<form action="http://localhost:8080/index.jsp" method="post">
    <tr>
        <td><input type="submit" value="Back"></td>
    </tr>
</form>
</body>
</html>

