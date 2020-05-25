package net.viralpatel.springbootgraphqlsubscription.model;

import java.time.LocalDateTime;

public class StockPrice {
    private String symbol;
    private double price;
    private LocalDateTime timestamp;

    public StockPrice(String symbol, double price, LocalDateTime timestamp) {
        this.price = price;
        this.symbol = symbol;
        this.timestamp = timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
