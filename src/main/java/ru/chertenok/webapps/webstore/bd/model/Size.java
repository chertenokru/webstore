package ru.chertenok.webapps.webstore.bd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Size implements Serializable {
    @Id
    private String code;
    @Id
    private String itemScale;
    private String rusName;

    public Size(String scale, String code, String rusName) {
        this.itemScale = scale;
        this.code = code;
        this.rusName = rusName;
    }

    public Size() {
    }

    public String getItemScale() {
        return itemScale;
    }

    public void setItemScale(String itemScale) {
        this.itemScale = itemScale;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }
}
