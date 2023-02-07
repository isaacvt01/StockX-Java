package edu.craptocraft.item;

public class Sale implements Offer {

    private String size;
    private Integer price;

    public Sale(String size, Integer ask) {
        this.size = size;
        this.price = ask;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value() {
        return this.price.intValue();
    }
    @Override
    public int compareTo(Offer offer) {
        return this.price.compareTo(offer.value());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t").append(this.size).append("\t").append(this.price).append("\n");
        return sb.toString();
    }
}
