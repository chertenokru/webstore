package ru.chertenok.webapps.webstore.controller.admin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class MainController {

    public String getLinkTovar() {
        return "/admin-item-view";
    }

    public String getLinkBrand() {
        return "/admin-brand-view";
    }

}
