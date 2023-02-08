package edu.craptocraft.criteria;

import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;
import edu.craptocraft.item.Sale;

import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria{
    public Sales() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Sale)
                .map(offer -> (Sale) offer)
                .collect(Collectors.toList());
    }
}
