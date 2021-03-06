package MasterClass.Collections.SortedCollection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, Stock> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(Stock item) {
        if (item != null) {
            Stock inStock = list.getOrDefault(item.getTitle(), item);
            if (inStock != item) {
                item.regulirovkaZapasa(inStock.AvailableOstatok());
            }
            list.put(item.getTitle(), item);
            return item.AvailableOstatok();
        }
        return 0;
    }

    public int selasStoke(String item, int kolichestvo) {
        Stock stock = list.get(item);
        if ((stock != null) && (kolichestvo > 0)) {
            return stock.ItogPoOstatku(kolichestvo);
        }
        return 0;
//        Stock inStock = list.getOrDefault(item, null);
//        if ((inStock != null) && (inStock.AvailableOstatok() >= kolichestvo) && (kolichestvo > 0)) {
//            inStock.regulirovkaZapasa(-kolichestvo);
//            return kolichestvo;
//        }
//        return 0;
    }

    public int rezervStock(String name, int kolichestvo) {
        Stock inStock = list.get(name);
        if ((inStock != null) && (kolichestvo > 0)) {
            return inStock.rezervStock(kolichestvo);
        }
        return 0;
    }

    public int unrezervStock(String name, int kolichestvo) {
        Stock inStock = list.get(name);
        if ((inStock != null) && (kolichestvo > 0)) {
            return inStock.unRezervStock(kolichestvo);
        }
        return 0;
    }


    public Stock get(String keyItem) {
        return list.get(keyItem);
    }

    public Map<String, Stock> Item() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String str = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, Stock> item : list.entrySet()) {
            Stock stock = item.getValue();
            double itemPrice = stock.getValuePrice() * stock.AvailableOstatok();
            str = str + stock + ".There are " + stock.AvailableOstatok() + " in stock .Values of items: ";
            str = str + String.format("%.2f", itemPrice) + "\n";
            totalCost += itemPrice;

        }
        return str + "Total stock value " + totalCost;
    }
}
