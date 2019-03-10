<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>3І програмування</title>
</head>
<body>


<div>Им'я: <c:out value="${requestScope.user.name}"/> </div>
<div>Вік: <c:out value="${requestScope.user.age}"/> </div>

<br />

<form method="post" action="<c:url value='/update'/>">

    <label>Нове им'я: <input type="text" name="name" /></label><br>

    <input type="number" hidden name="id" value="${requestScope.user.id}"/>

    <input type="submit" value="Ok" name="Ok"><br>
</form>
</body>
</html>