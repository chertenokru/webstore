<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!doctype html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title><%=request.getAttribute("title") %>
    </title>
    <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<div class="header">
    <h2 class="header_main"><a href="index"><img
            src="https://yt3.ggpht.com/a-/ACSszfEB3v2A3rTzX86zNhfkV3qhxPWFX4DJKZE4Ww=s900-mo-c-c0xffffffff-rj-k-no"></a><%=request.getAttribute("title") %>
    </h2>


    <ul class="menu_main">
        <li><a href="index"> Главная </a></li>
        <li><a href="catalog"> Каталог </a></li>
        <li><a href="contacts"> Контакты </a></li>
    </ul>

    <hr>

</div>

<% if (request.getAttribute("url") != null) {
    String s = (String) request.getAttribute("url");
    if (s != null) {
        out.flush();
        request.getRequestDispatcher(s).include(request, response);
    }
}

%>

<div class="footer">
    <hr>
    <p class="footer_copyrigth">&copy 2018 Все права защищены </p>
</div>

</body>

</html>
<% out.flush();%>