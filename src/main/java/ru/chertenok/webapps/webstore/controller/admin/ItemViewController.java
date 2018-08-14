package ru.chertenok.webapps.webstore.controller.admin;

import ru.chertenok.webapps.webstore.bd.dao.ItemDAO;
import ru.chertenok.webapps.webstore.bd.model.Item;
import ru.chertenok.webapps.webstore.bd.model.ItemVariant;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SessionScoped
@ManagedBean
public class ItemViewController {

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
}
