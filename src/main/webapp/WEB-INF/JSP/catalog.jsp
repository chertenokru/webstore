<%@ page import="ru.chertenok.webapps.webstore.model.Item" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content">

    <h3 class="text_centered">
        Каталог
    </h3>


    <% if (request.getAttribute("ItemList") != null) {
        Map<String, Item> items = (Map<String, Item>) request.getAttribute("ItemList");
        for (Item item : items.values()) {
    %>
    <div class="catalog_item  text_centered">
        <a href="item/<%=item.getNo()%>"><img src="<%= request.getContextPath() %>/IMG/no_image-800x800.png"
                                              alt="<%=item.getDescription() %>">
            <p><%=item.getDescription()%>. <%=item.getBrand().getDescription()%>
            </p></a>
    </div>
    <%
            }
        }
    %>

</div>
 