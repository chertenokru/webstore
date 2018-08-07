package ru.chertenok.webapps.webstore.dao;

import ru.chertenok.webapps.webstore.model.Item;

import java.util.List;

public interface DaoItems {
    Item getItemByID(String id);

    List<Item> getListItem(int from, int count);
}
