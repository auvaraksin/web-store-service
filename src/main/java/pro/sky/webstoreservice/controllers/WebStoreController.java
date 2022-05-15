package pro.sky.webstoreservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.webstoreservice.services.OrderServiceInterface;

import java.util.List;

@RestController
public class WebStoreController {
    private final OrderServiceInterface orderServiceInterface;

    public WebStoreController(OrderServiceInterface orderServiceInterface) {
        this.orderServiceInterface = orderServiceInterface;
    }

    @GetMapping("/add")
    public List<Integer> addItemsToTheCart(@RequestParam List<Integer> itemsList) {
        return orderServiceInterface.addItemsToTheCart(itemsList);
    }

    @GetMapping("/get")
    public List<Integer> showItemsInTheCart() {
        return orderServiceInterface.getItemsListInTheCart();
    }
}
