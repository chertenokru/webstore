package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class ItemVariantDAOimpl extends AbstractDAOimpl implements ItemVariantDAO {


    @Override
    public ItemVariant getItemByID(String itemID, String code) {
        return null;
    }

    @Override
    public void setItemVariantByID(String itemID, ItemVariant newItemVariant) {

    }

    @Override
    public Collection<ItemVariant> getItemVariant(String itemID) {
        return null;
    }

    @Override
    public void deleteItemVariantByID(String itemID, String code) {

    }

}
