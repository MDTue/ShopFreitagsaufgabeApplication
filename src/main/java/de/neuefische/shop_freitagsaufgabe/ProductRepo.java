package de.neuefische.shop_freitagsaufgabe;

import java.util.HashMap;
import java.util.List;

public class ProductRepo {

    private final HashMap<String,Product> allMyProducts;

    public ProductRepo() {
        allMyProducts = new HashMap<>();
    }

    public ProductRepo(HashMap<String, Product> allMyProducts) {
        this.allMyProducts = allMyProducts;
    }

    public void add(Product productToAdd){
        allMyProducts.put(productToAdd.getId(),productToAdd);
    }

    public List<Product> list(){
        return allMyProducts.values().stream().toList();
    }

    public Product get(String searchedId){
        Product foundProduct = allMyProducts.get(searchedId);
        if (foundProduct==null){
            throw new RuntimeException("Produkt mit der ID "+searchedId+" nicht gefunden!");
        } else {
            return foundProduct;
        }
    }

}
