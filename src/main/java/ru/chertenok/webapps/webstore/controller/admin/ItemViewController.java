package ru.chertenok.webapps.webstore.controller.admin;

import ru.chertenok.webapps.webstore.bd.dao.ItemDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@SessionScoped
@ManagedBean
public class ItemViewController {

    @Inject
    private ItemDAO itemDAO;


    public ItemDAO getItemDAO() {
        return itemDAO;
    }
}
