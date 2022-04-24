package pro.sky.webstoreservice.components;

import java.util.ArrayList;
import java.util.Objects;

public class Cart {
    private ArrayList<Integer> items;

    public Cart() {
        this.items = items;
    }

    public ArrayList<Integer> getItems() {
        return items;
    }

    public void setItems(ArrayList<Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cart cart = (Cart) obj;
        return items.equals(cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
