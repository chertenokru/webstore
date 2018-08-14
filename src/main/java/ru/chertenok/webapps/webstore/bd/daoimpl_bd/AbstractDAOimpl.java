package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAOimpl {
    @NotNull
    public static final String PERSISTENCE_UNIT = "MYSQLPersistence";

    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    protected EntityManager em;

}
