package ru.chertenok.webapps.webstore.bd.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

@Entity
@Embeddable
public class ItemScale implements Serializable {
    @Id
    private String code;
    private String description;
    @OneToMany
    private Map<String, Size> sizeList;

    public ItemScale(String code, String description, Map<String, Size> sizeList) {
        this.code = code;
        this.description = description;
        this.sizeList = sizeList;
    }

    public ItemScale() {
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

    public Collection<Size> getSizeList() {
        return sizeList.values();
    }

    public void setSizeList(Map<String, Size> sizeList) {
        this.sizeList = sizeList;
    }

    public Map<String, Size> getSizeMap() {
        return sizeList;
    }
}
