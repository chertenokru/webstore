<%@ page import="ru.chertenok.webapps.webstore.bd.model.Item" %>
<%@ page import="ru.chertenok.webapps.webstore.bd.model.ItemVariant" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content">
    <p><a href="<%= request.getContextPath() %>/catalog">&lt; Назад в каталог</a>
    </p>

    <h1>
        <%
            Item item = (Item) request.getAttribute("Item");
            if (item != null) {
        %>
        <p class="header_catalog text_centered"><%=item.getDescription() %>
        </p>
    </h1>
    <div class="detailed_item_image">
        <a href="<%= request.getContextPath() %>/IMG/no_image-800x800.png" target="_blank"><img
                src="<%= request.getContextPath() %>/IMG/no_image-800x800.png" alt="<%=item.getDescription()%>"></a>
    </div>
    <h2 class="header_catalog">Описание товара:</h2>
    <p class="text_detail_item"><%=item.getDescription()%> от бренда <%=item.getBrand().getDescription() %>
    </p>


    <h2 class="header_catalog"> Характеристики товара:</h2>
    <div class="list_item">

        <ul>
            <li>Артикул – <%=item.getArticle()%>
            </li>
            <li>Состав – <%=item.getCompaund()%>
            </li>
            <li>Страна-производитель – <%=item.getCountry() %>
            </li>
            <li>Бренд – <%=item.getBrand().getDescription()%>
            </li>
        </ul>

    </div>


    <table class="list_item table_item text-centered">
        <caption class="header_catalog">Варианты товара</caption>
        <tr>
            <td>Код</td>
            <td>Цвет</td>
            <td>Размер</td>
            <td></td>
        </tr>
        <%
            for (ItemVariant variant : item.getVariants().values()) {
        %>
        <tr>
            <td><%=variant.getCode()%>
            </td>
            <td><%=variant.getColor()%>
            </td>
            <td><%=variant.getSize().getCode()%>
            </td>
            <td>
                <div class="purchase text_centered">
                    <form action="<%= request.getContextPath() %>/cart/<%=item.getNo()%>/<%=variant.getCode()%>"
                          method="get">
                        <input type="submit" name="add" value="Купить" act>
                    </form>
                </div>

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
