package pro.sky.webstoreservice.services;

import java.util.List;

public interface OrderServiceInterface {
    List<Integer> addItemsToTheCart(List<Integer> itemsList);
    List<Integer> getItemsListInTheCart();
}
