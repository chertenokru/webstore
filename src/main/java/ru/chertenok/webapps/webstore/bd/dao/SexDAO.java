package ru.chertenok.webapps.webstore.bd.dao;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.model.Sex;

import java.util.Collection;

public interface SexDAO {
    Sex getSexByID(@NotNull String code);

    void setSetByID(@NotNull Sex sex);

    void deleteSexByID(@NotNull String code);

    Collection<Sex> getSexs();
}

