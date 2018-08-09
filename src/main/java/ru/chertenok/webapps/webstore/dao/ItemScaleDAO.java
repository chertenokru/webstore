package ru.chertenok.webapps.webstore.dao;

import ru.chertenok.webapps.webstore.model.ItemScale;

import java.util.Collection;

public interface ItemScaleDAO {
    ItemScale getitemScaleByID(String code);

    void setItemScaleByID(ItemScale itemScale);

    void deleteItemScaleByID(String code);

    Collection<ItemScale> getItemScales();
}
