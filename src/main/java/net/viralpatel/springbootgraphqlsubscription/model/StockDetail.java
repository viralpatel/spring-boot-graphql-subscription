package net.viralpatel.springbootgraphqlsubscription.model;

public class StockDetail {
    private String symbol;
    private String name;
    private long marketCap;

    public StockDetail(String symbol, String name, long marketCap) {
        this.name = name;
        this.symbol = symbol;
        this.marketCap = marketCap;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }
}
