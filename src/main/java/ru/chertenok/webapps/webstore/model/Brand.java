package ru.chertenok.webapps.webstore.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Brand {
    @Id
    private String code;
    private String Description;

    public Brand(String code, String description) {
        this.code = code;
        Description = description;
    }

    public Brand() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
