package ru.chertenok.webapps.webstore.bd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Size implements Serializable {
    @Id
    private String code;
    @Id
    private ItemScale itemScale;
    private String rusName;

    public Size(String code, String rusName) {
        this.code = code;
        this.rusName = rusName;
    }

    public Size() {
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
