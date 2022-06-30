package MasterClass.Collections.SortedCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final String nameofBasket;
    private final Map<Stock, Integer> listBasket;

    public Basket(String nameofBasket) {
        this.nameofBasket = nameofBasket;
        this.listBasket = new HashMap<>();

    }

    public int dobavitInBasket(Stock stock, int kolichestvo) {
        if ((stock != null) && (kolichestvo > 0)) {
            int inBasket = listBasket.getOrDefault(stock, 0);
            listBasket.put(stock, inBasket + kolichestvo);
            return inBasket;
        }
        return 0;
    }

    public Map<Stock, Integer> Items() {
        return Collections.unmodifiableMap(listBasket);
    }

    @Override
    public String toString() {
        String str = "\nShopping Basket " + nameofBasket + " contains " + listBasket.size() + "items\n";
        double totalPriceBasket = 0.0;
        for (Map.Entry<Stock, Integer> items : listBasket.entrySet()) {
            str = str + items.getKey() + ". " + items.getValue() + " purchased\n";
            totalPriceBasket += items.getKey().getValuePrice() * items.getValue();
        }
        return str + " Total cost " + totalPriceBasket;
    }
}
