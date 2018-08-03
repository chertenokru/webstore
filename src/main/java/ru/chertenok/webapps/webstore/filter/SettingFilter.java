package ru.chertenok.webapps.webstore.filter;


import ru.chertenok.webapps.webstore.config.Config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "SettingFilter", urlPatterns = {"/*"})
public class SettingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Config.setPathJsp(filterConfig.getServletContext().getInitParameter("PATH_JSP"));
        Config.setPageShablon(Config.getPathJsp() + filterConfig.getServletContext().getInitParameter("SHABLON"));

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");

        //servletResponse.setContentType("text/html; charset=UTF-8");
        //  System.out.println(servletResponse.getCharacterEncoding());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }


}
