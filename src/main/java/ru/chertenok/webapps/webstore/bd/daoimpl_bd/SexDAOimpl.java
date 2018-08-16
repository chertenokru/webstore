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
        return null;
    }

    @Override
    public void setSetByID(Sex sex) {

    }

    @Override
    public void deleteSexByID(String code) {

    }

    @Override
    public Collection<Sex> getSexs() {
        return null;
    }

}
