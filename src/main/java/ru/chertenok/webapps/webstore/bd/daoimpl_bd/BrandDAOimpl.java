package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class BrandDAOimpl extends AbstractDAOimpl implements BrandDAO {


    @Override
    public Brand getBrandByID(String code) {
        return em.createQuery("select brand from Brand brand where Brand .code= :code", Brand.class)
                .setParameter("code", code).getSingleResult();
    }

    @Override
    public void setBrand(Brand brand) {
        em.persist(brand);
    }

    @Override
    public void deleteBrandByID(String code) {
        em.remove(getBrandByID(code));
    }

    @Override
    public Collection<Brand> getBrands() {
        return em.createQuery("select brand from Brand brand", Brand.class).getResultList();
    }

}
