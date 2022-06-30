package MasterClass.Collections.SortedCollection;

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


        for (String s : stockList.Item().keySet()) {
            System.out.println(s);
        }

        Basket basket = new Basket("Andrey");
        sellItem(basket, "phone", 4);
        System.out.println(basket);

        sellItem(basket, "shorts", 5);
        System.out.println(basket);

        sellItem(basket, "breathe", 5);
        System.out.println(basket);

        sellItem(basket, "gantled", 7);
        System.out.println(basket);
        System.out.println(stockList);

        stock = new Stock("Gachi", 1.22);

        stockList.Item().get("shorts").regulirovkaZapasa(500);
        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int kolichestvo) {
        Stock stock = stockList.get(item);
        if (stock == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (stockList.selasStoke(item, kolichestvo) != 0) {
            basket.dobavitInBasket(stock, kolichestvo);
            return kolichestvo;
        }
        return 0;


    }
}























