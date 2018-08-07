<%@ page import="ru.chertenok.webapps.webstore.model.ItemVariant" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content">


    <table class="list_item table_item text-centered">
        <caption class="header_catalog">Товары в корзине</caption>
        <tr>
            <td>Код</td>
            <td>Цвет</td>
            <td>Размер</td>

        </tr>
        <%
            Map<String, ItemVariant> cart = (Map<String, ItemVariant>) request.getAttribute("Cart");
            if (cart != null) {
                for (ItemVariant variant : cart.values()) {
        %>
        <tr>
            <td><%=variant.getCode()%>
            </td>
            <td><%=variant.getColor()%>
            </td>
            <td><%=variant.getSize().getCode()%>
            </td>

        </tr>
        <% } %>
    </table>

    <% } else { %>
    Товар не найден
    <% } %>
    <p><a href="<%= request.getContextPath() %>/catalog">&lt; Назад в каталог</a>
    </p>

</div>
