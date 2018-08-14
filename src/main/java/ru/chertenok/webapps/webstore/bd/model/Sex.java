package ru.chertenok.webapps.webstore.bd.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Embeddable
public class Sex implements Serializable {
    @Id
    private String code;
    private String description;
    private boolean isChildren;

    public Sex(String code, String description, boolean isChildren) {
        this.code = code;
        this.description = description;
        this.isChildren = isChildren;
    }

    public Sex() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChildren() {
        return isChildren;
    }

    public void setChildren(boolean children) {
        isChildren = children;
    }
}
