package pro.sky.webstoreservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.webstoreservice.components.Cart;
import pro.sky.webstoreservice.services.OrderServiceInterface;

import java.util.ArrayList;

@RestController
public class WebStoreController {
    private final OrderServiceInterface orderServiceInterface;

    public WebStoreController(OrderServiceInterface orderServiceInterface) {
        this.orderServiceInterface = orderServiceInterface;
    }

    @GetMapping("/add")
    public Cart createNewCart(@RequestParam ArrayList<Integer> items) {
        return orderServiceInterface.addItemsToCart(items);
    }

    @GetMapping("/get")
    public ArrayList<Integer> showItemsInTheCart() {
        return orderServiceInterface.getItemsListInTheCart();
    }
}
