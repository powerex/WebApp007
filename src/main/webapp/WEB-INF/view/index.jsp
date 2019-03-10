<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
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

        <form method="post" action="<c:url value='/delete'/>">
            <input type="number" hidden name="id" value="${user.id}" />
            <input type="submit" name="delete" value="Видалити"/>
        </form>

        <form method="get" action="<c:url value='/update'/>">
            <input type="number" hidden name="id" value="${user.id}" />
            <input type="submit" value="Редагувати"/>
        </form>
    </ul>
    <hr />

</c:forEach>

<h2>Додаваня нового коритувача</h2><br />

<form method="post" action="<c:url value='/add_user'/>">

    <label><input type="text" name="name"></label>Им'я<br>

    <label><input type="number" name="age"></label>Вік<br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>

</body>
</html>