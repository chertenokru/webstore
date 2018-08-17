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
        return em.createQuery("select scale from ItemScale scale where scale.code= :code", ItemScale.class)
                .setParameter("code", code).getSingleResult();


    }

    @Override
    public void setItemScaleByID(ItemScale itemScale) {
        em.persist(itemScale);
    }

    @Override
    public void deleteItemScaleByID(String code) {
        em.remove(getitemScaleByID(code));
    }

    @Override
    public Collection<ItemScale> getItemScales() {
        return em.createQuery("select scale from ItemScale scale", ItemScale.class).getResultList();
    }

}
