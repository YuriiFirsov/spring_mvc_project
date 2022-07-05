<%--
  Created by IntelliJ IDEA.
  User: firso
  Date: 04.07.2022
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2> Введите ваши данные</h2>

<form:form action="/person-displaying-data" modelAttribute="person">

    Имя - <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Фамилия - <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Возраст - <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
    Электронная почта - <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Страна - <form:select path="country">
    <form:options items="${person.countries}"/>
    </form:select>

    Пол - <form:radiobuttons path="gender" items="${person.genders}"/>

    Владение языками -
    EN <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="Deutch"/>
    FR <form:checkbox path="languages" value="French"/>

    <input type="submit">
</form:form>

</body>
</html>
