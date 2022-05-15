package pro.sky.webstoreservice.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> itemsList) {
        items.addAll(itemsList);
        return itemsList;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
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
