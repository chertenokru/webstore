package ru.chertenok.webapps.webstore.bd.dao;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.model.ItemScale;

import java.util.Collection;

public interface ItemScaleDAO {
    ItemScale getitemScaleByID(@NotNull String code);

    void setItemScaleByID(@NotNull ItemScale itemScale);

    void deleteItemScaleByID(@NotNull String code);

    Collection<ItemScale> getItemScales();
}
