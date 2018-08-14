package ru.chertenok.webapps.webstore.bd.model;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

@Entity
public class Item implements Serializable {
    @Id
    private String no;
    @OneToOne
    private Brand brand;
    private String description;
    private String country;
    @OneToOne
    private Sex sex;
    private String article;
    private String compaund;
    private String compaundFull;
    @OneToOne
    private ItemScale itemScale;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "item")
    private Map<String, ItemVariant> variants;

    public Item() {
    }

    public Item(@NotNull String no, @NotNull Brand brand, @NotNull String description, @NotNull String country, @NotNull Sex sex, @NotNull String article, @NotNull String compaund, @NotNull String compaundFull, @NotNull ItemScale itemScale) {
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

    public void setNo(@NotNull String no) {
        this.no = no;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(@NotNull Brand brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(@NotNull String country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(@NotNull Sex sex) {
        this.sex = sex;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(@NotNull String article) {
        this.article = article;
    }

    public String getCompaund() {
        return compaund;
    }

    public void setCompaund(@NotNull String compaund) {
        this.compaund = compaund;
    }

    public String getCompaundFull() {
        return compaundFull;
    }

    public void setCompaundFull(@NotNull String compaundFull) {
        this.compaundFull = compaundFull;
    }

    public ItemScale getItemScale() {
        return itemScale;
    }

    public void setItemScale(@NotNull ItemScale itemScale) {
        this.itemScale = itemScale;
    }

    public Map<String, ItemVariant> getVariants() {
        return variants;
    }

    public Collection<ItemVariant> getListVariants() {
        return variants.values();
    }

    public void setVariants(@NotNull Map<String, ItemVariant> variants) {
        this.variants = variants;
    }
}
