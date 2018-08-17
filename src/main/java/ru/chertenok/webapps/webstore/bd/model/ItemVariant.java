package ru.chertenok.webapps.webstore.bd.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Embeddable
public class ItemVariant implements Serializable {
    @Id
    @ManyToOne
    private Item item;
    @Id
    private String code;
    private String size;
    private String color;

    public ItemVariant() {
    }

    public ItemVariant(Item item, String code, String size, String color) {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
