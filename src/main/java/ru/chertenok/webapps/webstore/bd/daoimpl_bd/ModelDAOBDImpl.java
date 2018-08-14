package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateful
public class ModelDAOBDImpl implements BrandDAO, ItemScaleDAO, ItemDAO, ItemVariantDAO, SexDAO, SizeDAO {

    @NotNull
    public static final String PERSISTENCE_UNIT = "MYSQLPersistence";

    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    protected EntityManager em;

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

    @Override
    public Item getItemByID(String code) {
        return null;
    }

    @Override
    public void setItemByID(Item code) {

    }

    @Override
    public Collection<Item> getItems() {
        return null;
    }

    @Override
    public void deleteItemByID(String code) {

    }

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

    @Override
    public ItemVariant getItemByID(String itemID, String code) {
        return null;
    }

    @Override
    public void setItemVariantByID(String itemID, ItemVariant newItemVariant) {

    }

    @Override
    public Collection<ItemVariant> getItemVariant(String itemID) {
        return null;
    }

    @Override
    public void deleteItemVariantByID(String itemID, String code) {

    }

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

    @Override
    public Size getSizeByID(String itemScaleCode, String code) {
        return null;
    }

    @Override
    public void setSizeByID(String itemScaleCode, Size size) {

    }

    @Override
    public void deleteSizeByID(String itemScaleCode, String code) {

    }

    @Override
    public Collection<Size> getSizes(String itemScaleCode) {
        return null;
    }
}
