package ru.chertenok.webapps.webstore.controller.admin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class MainController {

    public String getLinkTovar() {
        return LinkAdminConst.LINK_ITEM_VIEW;
    }

    public String getLinkBrand() {
        return LinkAdminConst.LINK_BRAND_VIEW;
    }

    public String getLinkSex() {
        return LinkAdminConst.LINK_SEX_VIEW;
    }

}
