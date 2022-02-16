package de.neuefische.shop_freitagsaufgabe;

import java.util.UUID;

public class Product {

    private String name;
    private String id;
    // nur für tests
    public Product(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public Product() {
        this.id =  UUID.randomUUID().toString();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}