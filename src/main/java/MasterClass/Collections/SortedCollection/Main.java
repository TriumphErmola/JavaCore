package MasterClass.Collections.SortedCollection;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        Stock stock = new Stock("Noski",2.99,100);
        stockList.addStock(stock);
        stock = new Stock("Underpants",4.00,80);
        stockList.addStock(stock);
        stock = new Stock("Books",6.99,42);
        stockList.addStock(stock);
        stock = new Stock("shorts",7.00,10);
        stockList.addStock(stock);
        stock = new Stock("breathe",0.99,25);
        stockList.addStock(stock);
        stock = new Stock("gantled",18,2);
        stockList.addStock(stock);
        stock = new Stock("phone",255.99,50);
        stockList.addStock(stock);

        System.out.println(stockList);

        for(String s : stockList.Item().keySet()){
            System.out.println(s);
        }
    }
}
