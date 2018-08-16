package ru.chertenok.webapps.webstore.bd.dao;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.model.Brand;

import java.util.Collection;


public interface BrandDAO {
    Brand getBrandByID(@NotNull String code);

    void setBrand(@NotNull Brand brand);

    void deleteBrandByID(@NotNull String code);

    Collection<Brand> getBrands();
}
