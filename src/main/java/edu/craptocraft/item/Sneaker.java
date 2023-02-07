package edu.craptocraft.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;
    List<Offer> offers = new ArrayList<Offer>();
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
    @Override
    public int getSale() {
        return sale;
    }

    @Override
    public void add(Offer offer) {
        offers.add(offer);
    }
    @Override
    public int getAsk() {
        return ask;
    }
    @Override
    public int getBid() {
        return bid;
    }
    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public List<Offer> offers() {
        return offers;
    }
    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }
    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }
}
