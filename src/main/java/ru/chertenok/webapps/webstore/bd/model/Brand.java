package ru.chertenok.webapps.webstore.bd.model;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Embeddable
public class Brand implements Serializable {
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

    public void setCode(@NotNull String code) {
        this.code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(@NotNull String description) {
        Description = description;
    }
}
