package ru.chertenok.webapps.webstore.daoimpl_test;

import ru.chertenok.webapps.webstore.model.*;

import java.util.*;

public class ModelCreator {
    private static final Random RND = new Random();
    private static final List<Brand> BRANDS = createBrands();
    private static final List<ItemScale> ITEM_SCALE = createItemScale();
    private static final List<Sex> ITEM_SEX = createItemSex();
    private static final String ITEM_PREF = "T";
    private static final String ITEMVARIANT_PREF = "V";
    private static final int NUM_LENGTH = 5;
    private static final int ITEMS_COUNT = 9;
    private static final int ITEMVARIANTS_COUNT = 5;
    private static final Map<String, Item> ITEMS = createItems();
    private static Map<String, ItemVariant> CART = new HashMap<>();

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

    private static Map<String, Item> createItems() {

        Map<String, Item> list = new HashMap<>();
        Item item;
        for (int i = 1; i <= ITEMS_COUNT; i++) {
            item = new Item(String.format("%s%0" + NUM_LENGTH + "d", ITEM_PREF, i), BRANDS.get(RND.nextInt(BRANDS.size())), Name.values()[RND.nextInt(Name.values().length)].name(),
                    Country.values()[RND.nextInt(Country.values().length)].name(), ITEM_SEX.get(RND.nextInt(ITEM_SEX.size())), "" + RND.nextInt(10) + RND.nextInt(10) + RND.nextInt(10) + RND.nextInt(10) + RND.nextInt(10),
                    Compaund.values()[RND.nextInt(Compaund.values().length)].toString(), "", ITEM_SCALE.get(RND.nextInt(ITEM_SCALE.size())));
            item.setCompaundFull(item.getCompaund());
            item.setVariants(createItemVariants(item));
            list.put(item.getNo(), item);
        }

        return list;
    }

    private static Map<String, ItemVariant> createItemVariants(Item item) {
        Map<String, ItemVariant> list = new HashMap<>();
        for (int i = 1; i <= ITEMVARIANTS_COUNT; i++) {
            list.put(String.format("%s%0" + NUM_LENGTH + "d", ITEMVARIANT_PREF, i), new ItemVariant(item, String.format("%s%0" + NUM_LENGTH + "d", ITEMVARIANT_PREF, i), item.getItemScale().getSizeList().get(RND.nextInt(item.getItemScale().getSizeList().size())), Color.values()[RND.nextInt(Color.values().length)].toString()));
        }
        return list;
    }

    public static List<Brand> getBrands() {
        return BRANDS;
    }

    public static List<ItemScale> getItemScales() {
        return ITEM_SCALE;
    }

    public static List<Sex> getItemSexes() {
        return ITEM_SEX;
    }

    public static Map<String, Item> getItems() {
        return ITEMS;
    }

    public static Map<String, ItemVariant> getCART() {
        return CART;
    }

    enum Name {Пальто, Рубашка, Джинсы, Сапоги, Платье}

    enum Country {Россия, Китай, Индия, Португалия}

    enum Color {Чёрный, Белый, Желтый, Зелённый, Бежевый}

    enum Compaund {Кожа, Полиестр, Шерсть, Хлопок}
}
