package ru.chertenok.webapps.webstore.controller.admin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.chertenok.webapps.webstore.bd.dao.SexDAO;
import ru.chertenok.webapps.webstore.bd.model.Sex;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class SexController {
    @Inject
    private SexDAO sexDAO;
    @NotNull
    private Sex sex;
    @NotNull
    private String code;


    public void init() {
        @Nullable Sex sex = null;
        if (!code.equals(""))
            sex = sexDAO.getSexByID(code);


        if (sex != null) this.sex = sex;
        else {
            code = "";
            this.sex = new Sex();
        }

    }

    public String save() {
        sexDAO.setSetByID(sex);
        return LinkAdminConst.LINK_SEX_VIEW;
    }


    public SexDAO getSexDAO() {
        return sexDAO;
    }

    public void setSexDAO(SexDAO sexDAO) {
        this.sexDAO = sexDAO;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSexEditLink() {
        return LinkAdminConst.LINK_SEX_EDIT;
    }

    public String getSexViewLink() {
        return LinkAdminConst.LINK_SEX_VIEW;
    }

    public String getMainAdminLink() {
        return LinkAdminConst.LINK_MAIN;
    }
}
