package MasterClass.Collections.SortedCollection;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        Stock stock = new Stock("Noski", 2.99, 100);
        stockList.addStock(stock);
        stock = new Stock("Underpants", 4.00, 80);
        stockList.addStock(stock);
        stock = new Stock("Books", 6.99, 42);
        stockList.addStock(stock);
        stock = new Stock("shorts", 7.00, 10);
        stockList.addStock(stock);
        stock = new Stock("breathe", 0.99, 25);
        stockList.addStock(stock);
        stock = new Stock("gantled", 18, 2);
        stockList.addStock(stock);
        stock = new Stock("phone", 255.99, 50);
        stockList.addStock(stock);
        stock = new Stock("car", 999.99, 10);
        stockList.addStock(stock);
        stock = new Stock("cup", 14.14, 10);
        stockList.addStock(stock);
        stock = new Stock("juice", 88.88, 80);
        stockList.addStock(stock);



        for (String s : stockList.Item().keySet()) {
            System.out.println(s);
        }

        Basket basket = new Basket("Andrey");
        sellItem(basket, "phone", 4);
        System.out.println(basket);

        sellItem(basket, "car", 5);
        System.out.println(basket);

        sellItem(basket, "shorts", 5);
        System.out.println(basket);

        sellItem(basket, "breathe", 5);
        System.out.println(basket);

        sellItem(basket, "gantled", 7);
        System.out.println(basket);

        stockList.Item().get("shorts").regulirovkaZapasa(500);

        Basket basket1 = new Basket("customer");
        sellItem(basket1,"cup",100);
        sellItem(basket1,"juice",5);
        removeItem(basket1,"cup",1);
        System.out.println(basket1);

        removeItem(basket,"breathe",3);
        removeItem(basket,"gantled",4);
        System.out.println("Car removed : "+ removeItem(basket,"car",1));

    }

    public static int sellItem(Basket basket, String item, int kolichestvo) {
        Stock stock = stockList.get(item);
        if (stock == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (stockList.rezervStock(item, kolichestvo) != 0) {
            return basket.dobavitInBasket(stock, kolichestvo);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int kolichestvo) {
        Stock stock = stockList.get(item);
        if (stock == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stock, kolichestvo) == kolichestvo) {
            return stockList.unrezervStock(item, kolichestvo);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<Stock, Integer> item : basket.Items().entrySet()) {
            stockList.selasStoke(item.getKey().getTitle(), item.getValue());
        }
        basket.clearBasket();
    }
}























