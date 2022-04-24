package pro.sky.webstoreservice.services;

import pro.sky.webstoreservice.components.Cart;

import java.util.ArrayList;

public interface OrderServiceInterface {
    Cart addItemsToCart(ArrayList<Integer> items);
    ArrayList<Integer> getItemsListInTheCart();
}
