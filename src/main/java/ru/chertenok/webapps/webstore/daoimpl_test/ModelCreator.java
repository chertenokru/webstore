package ru.chertenok.webapps.webstore.daoimpl_test;

import ru.chertenok.webapps.webstore.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ModelCreator {
    private static Random rnd = new Random();
    private static List<Brand> brands = createBrands();
    private static List<ItemScale> itemScales = createItemScale();
    private static List<Sex> itemSexes = createItemSex();
    private static List<Item> items = createItems();

    private static List<Brand> createBrands() {
        List<Brand> list = new ArrayList<>();
        list.add(new Brand("ARMANI_JEANS", "ARMANI JEANS"));
        list.add(new Brand("CALVIN K", "Calvin Klein"));
        list.add(new Brand("COACH", "Coach"));
        list.add(new Brand("K_LAGERFELD", "Karl Lagerfeld"));
        list.add(new Brand("M_KORS", "Michael Kors"));
        return list;
    }

    ;

    private static List<ItemScale> createItemScale() {
        List<ItemScale> listScale = new ArrayList<>();
        List<Size> listSize = new ArrayList<>();
        listSize.add(new Size("L", ""));
        listSize.add(new Size("M", ""));
        listSize.add(new Size("S", ""));
        listSize.add(new Size("XL", ""));
        listScale.add(new ItemScale("ЦВЕТ-РОСТ-ОДЕЖДА XX", "", listSize));
        listSize = new ArrayList<>();
        listSize.add(new Size("37/38", ""));
        listSize.add(new Size("39/40", ""));
        listSize.add(new Size("41/42", ""));
        listSize.add(new Size("43/44", ""));
        listScale.add(new ItemScale("ЦВЕТ-РОСТ-РУБАШКИ CI", "", listSize));

        return listScale;
    }

    ;

    private static List<Sex> createItemSex() {
        List<Sex> list = new ArrayList<>();
        list.add(new Sex("UNISEX", "Унисекс", false));
        list.add(new Sex("ДЕВ", "Девочки", true));
        list.add(new Sex("ДЕТ.", "Дети", true));
        list.add(new Sex("ЖЕН.", "Женский", false));
        list.add(new Sex("МАЛ", "Мальчики", true));
        list.add(new Sex("МУЖ.", "Мужской", false));
        return list;
    }

    private static List<Item> createItems() {

        List<Item> list = new ArrayList<>();
        Item item = new Item("T00001", brands.get(rnd.nextInt(brands.size())), Name.values()[rnd.nextInt(Name.values().length)].name(),
                Country.values()[rnd.nextInt(Country.values().length)].name(), itemSexes.get(rnd.nextInt(itemSexes.size())), "4354",
                "кожа", "чья-то кожа", itemScales.get(rnd.nextInt(itemScales.size())));
        item.setVariants(createItemVariants(item));
        list.add(item);

        item = new Item("T00002", brands.get(rnd.nextInt(brands.size())), Name.values()[rnd.nextInt(Name.values().length)].name(),
                Country.values()[rnd.nextInt(Country.values().length)].name(), itemSexes.get(rnd.nextInt(itemSexes.size())), "54752111",
                "кожа", "чья-то кожа", itemScales.get(rnd.nextInt(itemScales.size())));
        item.setVariants(createItemVariants(item));
        list.add(item);
        item = new Item("T00003", brands.get(rnd.nextInt(brands.size())), Name.values()[rnd.nextInt(Name.values().length)].name(),
                Country.values()[rnd.nextInt(Country.values().length)].name(), itemSexes.get(rnd.nextInt(itemSexes.size())), "54752111",
                "кожа", "чья-то кожа", itemScales.get(rnd.nextInt(itemScales.size())));
        item.setVariants(createItemVariants(item));
        list.add(item);


        return list;
    }

    private static List<ItemVariant> createItemVariants(Item item) {
        List<ItemVariant> list = new ArrayList<>();
        list.add(new ItemVariant(item, "V0001", item.getItemScale().getSizeList().get(rnd.nextInt(item.getItemScale().getSizeList().size())), "Чёрный"));
        list.add(new ItemVariant(item, "V0002", item.getItemScale().getSizeList().get(rnd.nextInt(item.getItemScale().getSizeList().size())), "Белый"));
        list.add(new ItemVariant(item, "V0003", item.getItemScale().getSizeList().get(rnd.nextInt(item.getItemScale().getSizeList().size())), "Синий"));
        return list;
    }

    public static List<Brand> getBrands() {
        return brands;
    }

    public static List<ItemScale> getItemScales() {
        return itemScales;
    }

    public static List<Sex> getItemSexes() {
        return itemSexes;
    }

    public static List<Item> getItems() {
        return items;
    }

    enum Name {Пальто, Рубашка, Джинсы, Сапоги}

    enum Country {Россия, Китай, Индия, Португалия}
}
