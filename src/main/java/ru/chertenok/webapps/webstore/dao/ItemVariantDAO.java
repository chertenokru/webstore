package ru.chertenok.webapps.webstore.dao;


import ru.chertenok.webapps.webstore.model.ItemVariant;

import java.util.Collection;

public interface ItemVariantDAO {
    ItemVariant getItemByID(String itemID, String code);

    void setItemVariantByID(String itemID, ItemVariant newItemVariant);

    Collection<ItemVariant> getItemVariant(String itemID);

    void deleteItemVariantByID(String itemID, String code);
}
