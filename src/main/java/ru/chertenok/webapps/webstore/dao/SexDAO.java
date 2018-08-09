package ru.chertenok.webapps.webstore.dao;

import ru.chertenok.webapps.webstore.model.Sex;

import java.util.Collection;

public interface SexDAO {
    Sex getSexByID(String code);

    void setSetByID(Sex sex);

    void deleteSexByID(String code);

    Collection<Sex> getSexs();
}

