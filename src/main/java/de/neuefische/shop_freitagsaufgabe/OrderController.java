package de.neuefische.shop_freitagsaufgabe;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final ShopService shopService;

    public OrderController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    private List<Order> getAllOrder() {
        return shopService.getAllOrder();
    }



    @GetMapping("/id")
    public Order getOrder(@PathVariable String id) {
        return shopService.getOrder(id);
    }


}
