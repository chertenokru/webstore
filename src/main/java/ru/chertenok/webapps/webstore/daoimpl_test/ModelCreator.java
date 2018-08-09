package ru.chertenok.webapps.webstore.daoimpl_test;

import ru.chertenok.webapps.webstore.model.*;

import java.util.*;


public class ModelCreator {
    private static final Random RND = new Random();
    private static final Map<String, Brand> BRANDS = createBrands();
    private static final Map<String, ItemScale> ITEM_SCALE = createItemScale();
    private static final Map<String, Sex> ITEM_SEX = createItemSex();
    private static final String ITEM_PREF = "T";
    private static final String ITEMVARIANT_PREF = "V";
    private static final int NUM_LENGTH = 5;
    private static final int ITEMS_COUNT = 9;
    private static final int ITEMVARIANTS_COUNT = 5;
    private static final Map<String, Item> ITEMS = createItems();
    private List<Item> item = new ArrayList<>(ITEMS.values());

    private static Map<String, ItemVariant> CART = new HashMap<>();

    public static Map<String, Item> getITEMS() {
        return ITEMS;
    }

    public List<ru.chertenok.webapps.webstore.model.Item> getItem() {
        return item;
    }

    public void setItem(List<ru.chertenok.webapps.webstore.model.Item> item) {
        this.item = item;
    }

    private static Map<String, Brand> createBrands() {
        Map<String, Brand> list = new HashMap<>();
        list.put("ARMANI_JEANS", new Brand("ARMANI_JEANS", "ARMANI JEANS"));
        list.put("CALVIN K", new Brand("CALVIN K", "Calvin Klein"));
        list.put("COACH", new Brand("COACH", "Coach"));
        list.put("K_LAGERFELD", new Brand("K_LAGERFELD", "Karl Lagerfeld"));
        list.put("M_KORS", new Brand("M_KORS", "Michael Kors"));
        return list;
    }


    private static Map<String, ItemScale> createItemScale() {
        Map<String, ItemScale> listScale = new HashMap<>();
        Map<String, Size> listSize = new HashMap<>();
        listSize.put("L", new Size("L", ""));
        listSize.put("M", new Size("M", ""));
        listSize.put("S", new Size("S", ""));
        listSize.put("XL", new Size("XL", ""));
        listScale.put("ЦВЕТ-РОСТ-ОДЕЖДА XX", new ItemScale("ЦВЕТ-РОСТ-ОДЕЖДА XX", "", listSize));
        listSize = new HashMap<>();
        listSize.put("37/38", new Size("37/38", ""));
        listSize.put("39/40", new Size("39/40", ""));
        listSize.put("41/42", new Size("41/42", ""));
        listSize.put("43/44", new Size("43/44", ""));
        listScale.put("ЦВЕТ-РОСТ-РУБАШКИ CI", new ItemScale("ЦВЕТ-РОСТ-РУБАШКИ CI", "", listSize));

        return listScale;
    }


    private static Map<String, Sex> createItemSex() {
        Map<String, Sex> list = new HashMap<>();
        list.put("UNISEX", new Sex("UNISEX", "Унисекс", false));
        list.put("ДЕВ", new Sex("ДЕВ", "Девочки", true));
        list.put("ДЕТ.", new Sex("ДЕТ.", "Дети", true));
        list.put("ЖЕН.", new Sex("ЖЕН.", "Женский", false));
        list.put("МАЛ", new Sex("МАЛ", "Мальчики", true));
        list.put("МУЖ.", new Sex("МУЖ.", "Мужской", false));
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
            list.put(String.format("%s%0" + NUM_LENGTH + "d", ITEMVARIANT_PREF, i), new ItemVariant(item, String.format("%s%0" + NUM_LENGTH + "d", ITEMVARIANT_PREF, i), item.getItemScale().getSizeMap().get(RND.nextInt(item.getItemScale().getSizeList().size())), Color.values()[RND.nextInt(Color.values().length)].toString()));
        }
        return list;
    }


    public static Map<String, Brand> getBrands() {
        return BRANDS;
    }

    public static Map<String, ItemScale> getItemScales() {
        return ITEM_SCALE;
    }

    public static Map<String, Sex> getItemSexes() {
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
