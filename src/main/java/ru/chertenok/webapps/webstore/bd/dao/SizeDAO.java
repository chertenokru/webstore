package ru.chertenok.webapps.webstore.bd.dao;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.model.Size;

import java.util.Collection;

public interface SizeDAO {
    Size getSizeByID(@NotNull String itemScaleCode, @NotNull String code);

    void setSizeByID(@NotNull String itemScaleCode, @NotNull Size size);

    void deleteSizeByID(@NotNull String itemScaleCode, @NotNull String code);

    Collection<Size> getSizes(@NotNull String itemScaleCode);
}
