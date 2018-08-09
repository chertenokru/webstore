package ru.chertenok.webapps.webstore.dao;

import ru.chertenok.webapps.webstore.model.Brand;

import java.util.Collection;

public interface BrandDAO {
    Brand getBrandByID(String code);

    void setBrand(Brand brand);

    void deleteBrandByID(String code);

    Collection<Brand> getBrands();
}
