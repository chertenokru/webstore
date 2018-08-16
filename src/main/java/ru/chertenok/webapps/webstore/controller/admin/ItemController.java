package ru.chertenok.webapps.webstore.controller.admin;

import ru.chertenok.webapps.webstore.bd.dao.ItemDAO;
import ru.chertenok.webapps.webstore.bd.model.Item;
import ru.chertenok.webapps.webstore.bd.model.ItemVariant;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;

@SessionScoped
@ManagedBean
public class ItemController {

    @Inject
    private ItemDAO itemDAO;


    public ItemDAO getItemDAO() {
        return itemDAO;
    }

    public Collection<ItemVariant> getVariantByItem(Item item) {
        Collection<ItemVariant> variants;
        if (item != null) variants = item.getListVariants();
        else variants = new ArrayList<>();
        return variants;

    }

    public String getItemViewLink() {
        return LinkAdminConst.LINK_ITEM_VIEW;
    }

    public String getItemEditLink() {
        return LinkAdminConst.LINK_ITEM_EDIT;
    }

    public String getMainAdminLink() {
        return LinkAdminConst.LINK_MAIN;
    }
}
