package ru.chertenok.webapps.webstore.bd.daoimpl_test;

import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import java.util.Collection;


public class ModelDaoTestImpl implements BrandDAO, ItemScaleDAO, ItemDAO, ItemVariantDAO, SexDAO, SizeDAO {


    @Override
    public Brand getBrandByID(String code) {
        return ModelCreator.getBrands().get(code);
    }

    @Override
    public void setBrand(Brand brand) {
        ModelCreator.getBrands().put(brand.getCode(), brand);
    }

    @Override
    public void deleteBrandByID(String code) {
        ModelCreator.getBrands().remove(code);
    }

    @Override
    public Collection<Brand> getBrands() {
        return ModelCreator.getBrands().values();
    }

    @Override
    public ItemScale getitemScaleByID(String code) {
        return ModelCreator.getItemScales().get(code);
    }

    @Override
    public void setItemScaleByID(ItemScale itemScale) {
        ModelCreator.getItemScales().put(itemScale.getCode(), itemScale);
    }

    @Override
    public void deleteItemScaleByID(String code) {
        ModelCreator.getItemScales().remove(code);
    }

    @Override
    public Collection<ItemScale> getItemScales() {
        return ModelCreator.getItemScales().values();
    }

    @Override
    public ItemVariant getItemByID(String itemID, String code) {
        return ModelCreator.getItems().get(itemID).getVariants().get(code);
    }

    @Override
    public void setItemVariantByID(String itemID, ItemVariant newItemVariant) {
        ModelCreator.getItems().get(itemID).getVariants().put(newItemVariant.getCode(), newItemVariant);
    }

    @Override
    public Collection<ItemVariant> getItemVariant(String itemID) {
        return ModelCreator.getItems().get(itemID).getVariants().values();
    }

    @Override
    public void deleteItemVariantByID(String itemID, String code) {
        ModelCreator.getItems().get(itemID).getVariants().remove(code);
    }

    @Override
    public Item getItemByID(String code) {
        return ModelCreator.getItems().get(code);
    }

    @Override
    public void setItemByID(Item item) {
        ModelCreator.getItems().put(item.getNo(), item);
    }

    @Override
    public Collection<Item> getItems() {
        return ModelCreator.getItems().values();
    }

    @Override
    public void deleteItemByID(String code) {
        ModelCreator.getItems().remove(code);
    }

    @Override
    public Sex getSexByID(String code) {
        return ModelCreator.getItemSexes().get(code);
    }

    @Override
    public void setSetByID(Sex sex) {
        ModelCreator.getItemSexes().put(sex.getCode(), sex);
    }

    @Override
    public void deleteSexByID(String code) {
        ModelCreator.getItemSexes().remove(code);
    }

    @Override
    public Collection<Sex> getSexs() {
        return ModelCreator.getItemSexes().values();
    }

    @Override
    public Size getSizeByID(String scale, String code) {
        return ModelCreator.getItemScales().get(scale).getSizeMap().get(code);
    }

    @Override
    public void setSizeByID(String scale, Size size) {
        ModelCreator.getItemScales().get(scale).getSizeMap().put(size.getCode(), size);
    }

    @Override
    public void deleteSizeByID(String scale, String code) {
        ModelCreator.getItemScales().get(scale).getSizeMap().remove(code);
    }

    @Override
    public Collection<Size> getSizes(String scale) {
        return ModelCreator.getItemScales().get(scale).getSizeMap().values();
    }
}
