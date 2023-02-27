package edu.craptocraft.criteria;

import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;
import edu.craptocraft.item.Sale;

import java.util.List;
import java.util.Optional;

public class LastSale implements Criteria{
    public LastSale() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> lastSale = item.offers().stream()
                .filter(offer -> offer instanceof Sale)
                .reduce((firstSale, secondSale) -> secondSale);
        return lastSale.isPresent()? List.of(lastSale.get()):List.of();
    }
}
