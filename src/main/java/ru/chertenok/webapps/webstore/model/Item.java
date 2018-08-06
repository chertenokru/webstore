package ru.chertenok.webapps.webstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    String no;
    Brand brand;
    String description;
    String country;
    String sex;
    Catalog catalog;
    CollectionItem collectionItem;
    String article;
    String compaund;
    String compaundFull;
    Framework framework;





}
