package de.neuefische.shop_freitagsaufgabe;



import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OrderRepo {

    private final HashMap<String,Order> allMyOrders;

    public OrderRepo() {
        allMyOrders = new HashMap<>();
    }

    public List<Order> list(){
        return allMyOrders.values().stream().toList();
    }

    public Optional<Order> get(String whichOrderID){
        return Optional.ofNullable(allMyOrders.get(whichOrderID));
    }

    public void add(Order orderToAdd){
        allMyOrders.put(orderToAdd.getOrderID(),orderToAdd);
    }

}