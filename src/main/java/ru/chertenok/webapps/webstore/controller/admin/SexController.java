package ru.chertenok.webapps.webstore.controller.admin;

import ru.chertenok.webapps.webstore.bd.dao.SexDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class SexController {
    @Inject
    private SexDAO sexDAO;

    public SexDAO getSexDAO() {
        return sexDAO;
    }

    public void setSexDAO(SexDAO sexDAO) {
        this.sexDAO = sexDAO;
    }

    public String getSexEditLink() {
        return LinkAdminConst.LINK_SEX_EDIT;
    }

    public String getMainAdminLink() {
        return LinkAdminConst.LINK_MAIN;
    }
}
