package edu.craptocraft.item;

public class Bid implements Offer{
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value() {
        return this.bid.intValue();
    }
    @Override
    public int compareTo(Offer offer) {
        return this.bid.compareTo(offer.value());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t").append(this.size).append("\t\t").append(this.bid).append("\n");
        return sb.toString();
    }
}
