package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class ItemDAOimpl extends AbstractDAOimpl implements ItemDAO {

    @Override
    public Item getItemByID(String code) {
        return null;
    }

    @Override
    public void setItemByID(Item code) {

    }

    @Override
    public Collection<Item> getItems() {
        return null;
    }

    @Override
    public void deleteItemByID(String code) {

    }
}
