package edu.craptocraft.item;

import java.util.List;

public interface Item {
    int getBid();
    int getAsk();
    int getSale();
    void add(Offer offer);
    void setBid(int price);
    void setAsk(int price);
    void setSale(int price);
    List<Offer> offers();
}
