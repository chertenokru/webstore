package ru.chertenok.webapps.webstore.bd.daoimpl_bd;

import ru.chertenok.webapps.webstore.bd.dao.SizeDAO;
import ru.chertenok.webapps.webstore.bd.model.Size;

import javax.ejb.Stateless;
import java.util.Collection;

@Stateless
public class SizeDAOimpl extends AbstractDAOimpl implements SizeDAO {


    @Override
    public Size getSizeByID(String itemScaleCode, String code) {
        return em.createQuery("select siz from Size siz where siz.code= :code and siz.itemScale= :scale", Size.class)
                .setParameter("code", code).setParameter("scale", itemScaleCode).getSingleResult();
    }

    @Override
    public void setSizeByID(Size size) {
        em.persist(size);
    }

    @Override
    public void deleteSizeByID(String itemScaleCode, String code) {
        em.remove(getSizeByID(itemScaleCode, code));
    }

    @Override
    public Collection<Size> getSizes(String itemScaleCode) {
        return null;
    }
}
