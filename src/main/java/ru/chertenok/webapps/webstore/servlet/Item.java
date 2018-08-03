package ru.chertenok.webapps.webstore.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "item", urlPatterns = {"/item"})
public class Item extends HttpServlet {
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

        req.getRequestDispatcher(getServletContext().getInitParameter("PATH_JSP")
                + getServletContext().getInitParameter("SHABLON")).forward(req, resp);
    }
}