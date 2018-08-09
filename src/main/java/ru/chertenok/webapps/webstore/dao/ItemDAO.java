package ru.chertenok.webapps.webstore.dao;

import ru.chertenok.webapps.webstore.model.Item;

import java.util.Collection;

public interface ItemDAO {
    Item getItemByID(String code);

    void setItemByID(Item code);

    Collection<Item> getItems();

    void deleteItemByID(String code);

}
