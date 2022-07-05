<%--
  Created by IntelliJ IDEA.
  User: firso
  Date: 04.07.2022
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Введите свои данные</h2>
<form action="/welcome" method="get">
    <input type="text" name="firstname"
           placeholder="Введите имя">

    <br>
    <input type="text" name="surname"
           placeholder="Введите фамилию">

    <br>
    <input type="submit">
</form>

</body>
</html>
