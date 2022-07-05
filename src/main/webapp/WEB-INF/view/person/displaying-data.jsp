<%--
  Created by IntelliJ IDEA.
  User: firso
  Date: 04.07.2022
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
Добро пожаловать ${person.name} ${person.surname} из ${person.country}

<br>
${person.gender}
<br>
<c:if test="${person.gender == 'male'}">
    Вы красавчик
</c:if>
<c:if test="${person.gender == 'female'}">
    Вы красотка
</c:if>

Вау! вы владете:
<c:forEach var = "lang" items="${person.languages}">
    ${lang}
</c:forEach>
</body>
</html>
