package ru.chertenok.webapps.webstore.controller.admin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.chertenok.webapps.webstore.bd.dao.BrandDAO;
import ru.chertenok.webapps.webstore.bd.model.Brand;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class BrandViewController {

    @Inject
    private BrandDAO brandDAO;


    @NotNull
    private String code;

    @NotNull
    private Brand brand;


    public BrandViewController() {
    }

    public BrandDAO getBrandDAO() {
        return brandDAO;
    }

    @NotNull
    public String getCode() {
        return code;
    }

    public void setCode(@NotNull String code) {
        this.code = code;
    }

    public void init() {
        @Nullable final Brand brand = brandDAO.getBrandByID(code);
        if (brand != null) this.brand = brand;
        else {
            code = "";
            this.brand = new Brand();
        }
        ;
    }

    public String save() {
        brandDAO.setBrand(brand);
        return "/admin-brand-view";
    }

    @NotNull
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(@NotNull Brand brand) {
        this.brand = brand;
    }
}
