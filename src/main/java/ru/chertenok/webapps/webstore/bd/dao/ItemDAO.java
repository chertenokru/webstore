package ru.chertenok.webapps.webstore.bd.dao;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.model.Item;

import java.util.Collection;

public interface ItemDAO {
    Item getItemByID(@NotNull String code);

    void setItemByID(@NotNull Item code);

    Collection<Item> getItems();

    void deleteItemByID(@NotNull String code);

}
