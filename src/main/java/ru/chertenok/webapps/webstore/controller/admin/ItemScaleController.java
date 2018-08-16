package ru.chertenok.webapps.webstore.controller.admin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.chertenok.webapps.webstore.bd.dao.ItemScaleDAO;
import ru.chertenok.webapps.webstore.bd.model.ItemScale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class ItemScaleController {

    @Inject
    private ItemScaleDAO itemScaleDAO;


    @NotNull
    private String code;

    @NotNull
    private ItemScale scale;


    public ItemScaleDAO getScaleDAO() {
        return itemScaleDAO;
    }

    @NotNull
    public String getCode() {
        return code;
    }

    public void setCode(@NotNull String code) {
        this.code = code;
    }

    public void init() {
        @Nullable ItemScale scale = null;
        if (!code.equals(""))
            scale = itemScaleDAO.getitemScaleByID(code);


        if (scale != null) this.scale = scale;
        else {
            code = "";
            this.scale = new ItemScale();
        }

    }

    public String save() {
        itemScaleDAO.setItemScaleByID(scale);
        return LinkAdminConst.LINK_SCALE_VIEW;
    }

    public String getScaleEditLink() {
        return LinkAdminConst.LINK_SCALE_EDIT;
    }

    public String getScaleViewLink() {
        return LinkAdminConst.LINK_SCALE_VIEW;
    }

    public String getMainAdminLink() {
        return LinkAdminConst.LINK_MAIN;
    }

    public String getSizeViewLink() {
        return LinkAdminConst.LINK_SIZE_VIEW;
    }

    public String getSizeEditLink() {
        return LinkAdminConst.LINK_SIZE_EDIT;
    }

    @NotNull
    public ItemScale getScale() {
        return scale;
    }

    public void setScale(@NotNull ItemScale scale) {
        this.scale = scale;
    }
}
