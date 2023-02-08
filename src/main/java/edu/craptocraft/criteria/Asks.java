package edu.craptocraft.criteria;

import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{
    public Asks() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Ask)
                .map(offer -> (Ask) offer)
                .collect(Collectors.toList());
    }
}
