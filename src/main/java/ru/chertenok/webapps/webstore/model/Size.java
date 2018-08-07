package ru.chertenok.webapps.webstore.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Size {
    @Id
    private String code;
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
