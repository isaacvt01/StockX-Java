package edu.craptocraft.criteria;

import edu.craptocraft.item.Bid;
import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {
    public Bids() {};

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Bid)
                .map(offer -> (Bid) offer)
                .collect(Collectors.toList());
    }

}
