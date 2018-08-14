package ru.chertenok.webapps.webstore;

import ru.chertenok.webapps.webstore.bd.daoimpl_test.ModelCreator;
import ru.chertenok.webapps.webstore.bd.model.Item;
import ru.chertenok.webapps.webstore.bd.model.ItemVariant;

public class Test {


    public static void main(String[] args) {


        for (Item i : ModelCreator.getItems().values()) {
            System.out.printf("Товар %s, артикул %s, описание %s бренд %s  шкала %s страна %s  пол %s состав %s полный состав %s \n",
                    i.getNo(), i.getArticle(), i.getDescription(), i.getBrand().getDescription(), i.getItemScale().getCode(), i.getCountry(), i.getSex().getDescription(), i.getCompaund(), i.getCompaundFull());
            for (ItemVariant iv : i.getVariants().values()) {
                System.out.printf("Вариант %s, цвет %s размер %s \n", iv.getCode(), iv.getColor(), iv.getSize().getCode());
            }
        }


    }
}
