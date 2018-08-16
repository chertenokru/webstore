package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import org.jetbrains.annotations.NotNull;
import ru.chertenok.webapps.webstore.bd.dao.*;
import ru.chertenok.webapps.webstore.bd.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class SizeDAOimpl extends AbstractDAOimpl implements SizeDAO {


    @Override
    public Size getSizeByID(String itemScaleCode, String code) {
        return null;
    }

    @Override
    public void setSizeByID(String itemScaleCode, Size size) {

    }

    @Override
    public void deleteSizeByID(String itemScaleCode, String code) {

    }

    @Override
    public Collection<Size> getSizes(String itemScaleCode) {
        return null;
    }
}
