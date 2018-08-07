package ru.chertenok.webapps.webstore.model;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Item {
    @Id
    private String no;
    private Brand brand;
    private String description;
    private String country;
    private Sex sex;
    private String article;
    private String compaund;
    private String compaundFull;
    private ItemScale itemScale;
    @OneToMany
    private Map<String, ItemVariant> variants;

    public Item() {
    }

    public Item(String no, Brand brand, String description, String country, Sex sex, String article, String compaund, String compaundFull, ItemScale itemScale) {
        this.no = no;
        this.brand = brand;
        this.description = description;
        this.country = country;
        this.sex = sex;
        this.article = article;
        this.compaund = compaund;
        this.compaundFull = compaundFull;
        this.itemScale = itemScale;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getCompaund() {
        return compaund;
    }

    public void setCompaund(String compaund) {
        this.compaund = compaund;
    }

    public String getCompaundFull() {
        return compaundFull;
    }

    public void setCompaundFull(String compaundFull) {
        this.compaundFull = compaundFull;
    }

    public ItemScale getItemScale() {
        return itemScale;
    }

    public void setItemScale(ItemScale itemScale) {
        this.itemScale = itemScale;
    }

    public Map<String, ItemVariant> getVariants() {
        return variants;
    }

    public void setVariants(Map<String, ItemVariant> variants) {
        this.variants = variants;
    }
}
