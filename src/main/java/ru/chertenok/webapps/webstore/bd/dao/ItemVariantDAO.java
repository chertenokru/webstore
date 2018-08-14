package ru.chertenok.webapps.webstore.bd.dao;


import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.model.ItemVariant;

import java.util.Collection;

public interface ItemVariantDAO {
    ItemVariant getItemByID(@NotNull String itemID, @NotNull String code);

    void setItemVariantByID(@NotNull String itemID, @NotNull ItemVariant newItemVariant);

    Collection<ItemVariant> getItemVariant(@NotNull String itemID);

    void deleteItemVariantByID(@NotNull String itemID, @NotNull String code);
}
