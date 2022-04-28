package pro.sky.webstoreservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.webstoreservice.components.Cart;

import java.util.ArrayList;

@Service
@SessionScope
public class OrderServiceInterfaceImpl implements OrderServiceInterface {
    Cart cart = new Cart();

    @Override
    public Cart addItemsToCart(ArrayList<Integer> items) {
        cart.setItems(items);
        return cart;
    }

    @Override
    public ArrayList<Integer> getItemsListInTheCart() {
        if (cart.getItems().equals(null)) {
            throw new RuntimeException("The items list is empty");
        }
        return cart.getItems();
    }

}
