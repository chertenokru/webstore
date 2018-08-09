package ru.chertenok.webapps.webstore.dao;

import ru.chertenok.webapps.webstore.model.Size;

import java.util.Collection;

public interface SizeDAO {
    Size getSizeByID(String itemScaleCode, String code);

    void setSizeByID(String itemScaleCode, Size size);

    void deleteSizeByID(String itemScaleCode, String code);

    Collection<Size> getSizes(String itemScaleCode);
}
