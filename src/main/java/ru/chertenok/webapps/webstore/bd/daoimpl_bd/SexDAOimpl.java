package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class SexDAOimpl extends AbstractDAOimpl implements SexDAO {

    @Override
    public Sex getSexByID(String code) {
        return em.createQuery("select sex from Sex sex where sex.code= :code", Sex.class)
                .setParameter("code", code).getSingleResult();
    }

    @Override
    public void setSetByID(@NotNull Sex sex) {
        em.persist(sex);

    }

    @Override
    public void deleteSexByID(@NotNull String code) {
        em.remove(getSexByID(code));
    }

    @Override
    public Collection<Sex> getSexs() {
        return em.createQuery("select sex from Sex sex", Sex.class).getResultList();
    }

}
