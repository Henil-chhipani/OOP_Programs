package StockMObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();
    private double stockPrice;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setStockPrice(double price) {
        if (price != stockPrice) {
            stockPrice = price;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockPrice);
        }
    }
}

// Observer
interface StockObserver {
    void update(double stockPrice);
}

// Concrete Observer
class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + " received an update. Stock price: " + stockPrice);
    }
}

public class StockMarketExample {
    public static void main(String[] args) {
        // Create the stock market
        StockMarket stockMarket = new StockMarket();

        // Create some investors (observers)
        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");

        // Register investors as observers
        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        // Set initial stock price
        stockMarket.setStockPrice(100.0);

        // Simulate stock price changes
        stockMarket.setStockPrice(110.0);
        stockMarket.setStockPrice(95.0);

        // Unregister an investor
        stockMarket.removeObserver(investor1);

        // Simulate more stock price changes
        stockMarket.setStockPrice(105.0);
    }
}
