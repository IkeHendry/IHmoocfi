import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (!this.prices.containsKey(product)) {
            return -99;
        } else {
            return this.prices.get(product);
        }
    }

    public int stock(String product) {
        if (!this.stocks.containsKey(product)) {
            return 0;
        } else {
            return this.stocks.get(product);
        }
    }

    public boolean take(String product) {
        if (!this.stocks.containsKey(product)) {
            return false;
        } else {
            if (this.stocks.get(product) > 0) {
                int newValue = Integer.valueOf(this.stocks.get(product) - 1);
                this.stocks.replace(product, Integer.valueOf(newValue));
                return true;
            }
            return false;
        }
    }
    public Set<String> products(){
        return stocks.keySet();
    }
}
