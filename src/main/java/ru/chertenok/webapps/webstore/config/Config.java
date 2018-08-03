package ru.chertenok.webapps.webstore.config;

public class Config {
    private static String PATH_JSP = "";
    private static String PAGE_SHABLON = "shablon.jsp";

    public static String getPathJsp() {
        return PATH_JSP;
    }

    public static void setPathJsp(String pathJsp) {
        PATH_JSP = pathJsp;
    }

    public static String getPageShablon() {
        return PAGE_SHABLON;
    }

    public static void setPageShablon(String pageShablon) {
        PAGE_SHABLON = pageShablon;
    }
}
