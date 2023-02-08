package edu.craptocraft.criteria;

import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria{

    public MinAsk() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> minimumAsk = item.offers().stream()
                .filter(offer -> offer instanceof Ask)
                .min(Offer::compareTo);
        return minimumAsk.isPresent()? List.of(minimumAsk.get()):List.of() ;
    }
}
