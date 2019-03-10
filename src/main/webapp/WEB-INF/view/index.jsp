<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>3І програмування</title>

</head>
<body>

<h1>Користувачі НПУ!</h1><br />

<h2>Всі користувачі</h2><br />

<c:forEach var="user" items="${requestScope.users}">
    <ul>

        <li>Им'я: <c:out value="${user.name}"/></li>

        <li>Вік: <c:out value="${user.age}"/></li>
    </ul>
    <hr />

</c:forEach>

<h2>Додавання нового користувача</h2><br />

<form method="post" action="">

    <label><input type="text" name="name"></label>Им'я<br>

    <label><input type="number" name="age"></label>Вік<br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>

</body>
</html>