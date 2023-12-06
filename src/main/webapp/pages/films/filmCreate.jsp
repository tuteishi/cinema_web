<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head> Create new film</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Show date</th>
    </tr>
    </thead>
    <tbody>
    <form action="/films/create" method="post">
        <tr>
            <td><input type="text" name="name" placeholder="Enter film name"></td>
            <td><input type="text" name="showDate" placeholder="Enter data show"></td>
            <td><input type="submit" value="Create new film"></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
