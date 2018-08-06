package ru.chertenok.webapps.webstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ItemScale {
    @Id
    private String code;
    private String description;
    private List<Size> sizeList;

    public ItemScale(String code, String description, List<Size> sizeList) {
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

    public List<Size> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<Size> sizeList) {
        this.sizeList = sizeList;
    }
}
