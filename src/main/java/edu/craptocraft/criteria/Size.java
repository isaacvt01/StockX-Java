package edu.craptocraft.criteria;

import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria{
    private final String dimensions;

    public Size(String size) {
        this.dimensions = size;
    }
    public String getSize(){
        return this.dimensions;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer.size().equals(dimensions) )
                .collect(Collectors.toList());
    }
}
