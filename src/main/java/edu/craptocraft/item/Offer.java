package edu.craptocraft.item;

public interface Offer {
    String size();
    int value();
    int compareTo(Offer offer);
}
