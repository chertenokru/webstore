package ru.chertenok.webapps.webstore.servlet;


import ru.chertenok.webapps.webstore.bd.daoimpl_test.ModelCreator;
import ru.chertenok.webapps.webstore.bd.model.Item;
import ru.chertenok.webapps.webstore.config.Config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/item/*"})
public class ServletItem extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Интернет-витрина. Товар");
        req.setAttribute("url", "item.jsp");
        String itemCode = "";
        try {
            itemCode = (req.getRequestURI().split("/", 4)[3]);
        } catch (Exception e) {
        }

        if (itemCode.equals("")) {
            req.getRequestDispatcher("/catalog").forward(req, resp);
        }
        Item item = ModelCreator.getItems().get(itemCode);
        if (item == null) {
            req.getRequestDispatcher("/catalog").forward(req, resp);
        }

        req.setAttribute("Item", item);

        req.getRequestDispatcher(Config.getPageShablon()).forward(req, resp);
    }
}
