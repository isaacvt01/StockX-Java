package edu.craptocraft.item;

public class Sneaker {
    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;
    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getSale() {
        return sale;
    }

    public int getAsk() {
        return ask;
    }

    public int getBid() {
        return bid;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
}
