package ru.chertenok.webapps.webstore.servlet;

import ru.chertenok.webapps.webstore.bd.daoimpl_test.ModelCreator;
import ru.chertenok.webapps.webstore.bd.model.ItemVariant;
import ru.chertenok.webapps.webstore.config.Config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = {"/cart/*"})
public class ServletShopCart extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Интернет-витрина. Корзина");
        req.setAttribute("url", "cart.jsp");
        String itemCode = "";
        String itemVariantCode = "";
        try {
            itemCode = (req.getRequestURI().split("/", 5)[3]);
            itemVariantCode = (req.getRequestURI().split("/", 5)[4]);
        } catch (Exception e) {
        }

        Map<String, ItemVariant> cart = ModelCreator.getCART();

        if ((!itemCode.equals("")) && (!itemVariantCode.equals(""))) {
            ItemVariant variant = ModelCreator.getItems().get(itemCode).getVariants().get(itemVariantCode);
            cart.put(itemCode, variant);
        }

        req.setAttribute("Cart", cart);
        req.getRequestDispatcher(Config.getPageShablon()).forward(req, resp);
    }

}
