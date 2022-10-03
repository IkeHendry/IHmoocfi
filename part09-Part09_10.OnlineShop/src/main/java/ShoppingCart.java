
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<String, Item>();
    }

    public void add(String product, int price) {
        if (!items.containsKey(product)) {
            Item item = new Item(product, 1 , price);
            items.put(product, item);
        } else {
            items.get(product).increaseQuantity();
        }
    }

    public int price() {
        int total = 0;
        for (Item item : items.values()) {
            total = total + item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : items.values()){
            System.out.println(item);
        }
    }
}
