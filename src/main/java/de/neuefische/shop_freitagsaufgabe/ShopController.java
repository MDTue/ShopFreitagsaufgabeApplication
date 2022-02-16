package de.neuefische.shop_freitagsaufgabe;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")

public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return shopService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return shopService.getProduct(id);
    }

    @PostMapping
    public void addProductsToList(@RequestBody Product product){
        shopService.addProduct(product);
    }

}
