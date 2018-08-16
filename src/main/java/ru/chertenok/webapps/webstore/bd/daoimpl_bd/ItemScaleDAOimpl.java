package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class ItemScaleDAOimpl extends AbstractDAOimpl implements ItemScaleDAO {


    @Override
    public ItemScale getitemScaleByID(String code) {
        return null;
    }

    @Override
    public void setItemScaleByID(ItemScale itemScale) {

    }

    @Override
    public void deleteItemScaleByID(String code) {

    }

    @Override
    public Collection<ItemScale> getItemScales() {
        return null;
    }

}
