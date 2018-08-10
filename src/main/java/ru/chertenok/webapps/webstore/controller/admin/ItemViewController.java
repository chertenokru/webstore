package ru.chertenok.webapps.webstore.controller.admin;

import ru.chertenok.webapps.webstore.dao.ItemDAO;

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

    private void setItemDAO(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    public void setItem(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }
}
