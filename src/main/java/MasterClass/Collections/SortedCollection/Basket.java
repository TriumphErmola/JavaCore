package MasterClass.Collections.SortedCollection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String nameofBasket;
    private final Map<Stock, Integer> listBasket;

    public Basket(String nameofBasket) {
        this.nameofBasket = nameofBasket;
        this.listBasket = new TreeMap<>();

    }

    public int dobavitInBasket(Stock stock, int kolichestvo) {
        if ((stock != null) && (kolichestvo > 0)) {
            int inBasket = listBasket.getOrDefault(stock, 0);
            listBasket.put(stock, inBasket + kolichestvo);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(Stock item, int kolichestvo) {
        if ((item != null) && (kolichestvo > 0)) {
            int nalichieInBasket = listBasket.getOrDefault(item, 0);
            int newKolichestvo = nalichieInBasket + kolichestvo;
            if (newKolichestvo > 0) {
                listBasket.put(item, newKolichestvo);
                return kolichestvo;
            } else if (newKolichestvo == 0) {
                listBasket.remove(item);
                return kolichestvo;
            }
        }
        return 0;
    }

    public void clearBasket(){
         this.listBasket.clear();
    }

    public Map<Stock, Integer> Items() {
        return Collections.unmodifiableMap(listBasket);
    }

    @Override
    public String toString() {
        String str = "\nShopping Basket " + nameofBasket + " contains " + listBasket.size()
                + ((listBasket.size() == 1) ? " item " : " items ") + "\n";
        double totalPriceBasket = 0.0;
        for (Map.Entry<Stock, Integer> items : listBasket.entrySet()) {
            str = str + items.getKey() + ". " + items.getValue() + " purchased\n";
            totalPriceBasket += items.getKey().getValuePrice() * items.getValue();
        }
        return str + " Total cost " + totalPriceBasket;
    }
}
