package edu.craptocraft.item;

public class Ask implements Offer{

    private String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value() {
        return this.ask.intValue();
    }
    @Override
    public int compareTo(Offer offer) {
        return this.ask.compareTo(offer.value());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t").append(this.size).append("\t\t").append(this.ask).append("\n");
        return sb.toString();
    }
}
