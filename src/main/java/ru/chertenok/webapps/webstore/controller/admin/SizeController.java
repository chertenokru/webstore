package ru.chertenok.webapps.webstore.controller.admin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.chertenok.webapps.webstore.bd.dao.SizeDAO;
import ru.chertenok.webapps.webstore.bd.model.Size;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class SizeController {
    @Inject
    private SizeDAO sizeDAO;
    @NotNull
    private Size size;
    @NotNull
    private String code = "";
    @NotNull
    private String scale = "";

    @NotNull
    public String getScale() {
        return scale;
    }

    public void setScale(@NotNull String scale) {
        this.scale = scale;
    }

    public void init() {
        @Nullable Size size = null;
        if (!code.equals(""))
            size = sizeDAO.getSizeByID(scale, code);


        if (size != null) this.size = size;
        else {
            code = "";
            this.size = new Size(scale, "", "");
        }

    }

    public String save() {
        sizeDAO.setSizeByID(size);
        return LinkAdminConst.LINK_SCALE_VIEW;
    }


    public SizeDAO getSexDAO() {
        return sizeDAO;
    }

    public void setSexDAO(SizeDAO sizeDAO) {
        this.sizeDAO = sizeDAO;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size sex) {
        this.size = size;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSizeEditLink() {
        return LinkAdminConst.LINK_SIZE_EDIT;
    }

    public String getScaleViewLink() {
        return LinkAdminConst.LINK_SCALE_VIEW;
    }

    public String getSizeViewLink() {
        return LinkAdminConst.LINK_SIZE_VIEW;
    }

    public String getMainAdminLink() {
        return LinkAdminConst.LINK_MAIN;
    }
}
