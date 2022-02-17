package de.neuefische.shop_freitagsaufgabe;

public class Repository {
    public String name;

    public Repository(String name) {
        this.name = name;
    }

    public Repository() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
