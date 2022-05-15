package pro.sky.webstoreservice.services;

import org.springframework.stereotype.Service;
import pro.sky.webstoreservice.components.Cart;

import java.util.List;

@Service
public class OrderServiceInterfaceImpl implements OrderServiceInterface {
   private final Cart cart;

   public OrderServiceInterfaceImpl(Cart cart) {
       this.cart = cart;
   }

    @Override
    public List<Integer> addItemsToTheCart(List<Integer> itemsList) {
        return cart.addItems(itemsList);
    }

    @Override
    public List<Integer> getItemsListInTheCart() {
        return cart.getItems();
    }

}
