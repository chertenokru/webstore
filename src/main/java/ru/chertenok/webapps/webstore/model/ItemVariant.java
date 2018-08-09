package ru.chertenok.webapps.webstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class ItemVariant {
    @Id
    @OneToOne
    private Item item;
    @Id
    private String code;
    @OneToOne
    private Size size;
    private String color;

    public ItemVariant() {
    }

    public ItemVariant(Item item, String code, Size size, String color) {
        this.item = item;
        this.code = code;
        this.size = size;
        this.color = color;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
