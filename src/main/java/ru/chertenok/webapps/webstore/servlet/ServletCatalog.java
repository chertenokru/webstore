package ru.chertenok.webapps.webstore.servlet;


import ru.chertenok.webapps.webstore.config.Config;
import ru.chertenok.webapps.webstore.daoimpl_test.ModelCreator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/catalog"})
public class ServletCatalog extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Интернет-витрина. Каталог");
        req.setAttribute("url", "catalog.jsp");
        req.setAttribute("ItemList", ModelCreator.getItems());

        req.getRequestDispatcher(Config.getPageShablon()).forward(req, resp);
    }
}
