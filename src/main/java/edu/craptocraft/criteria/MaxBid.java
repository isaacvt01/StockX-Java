package edu.craptocraft.criteria;

import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Bid;
import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxBid implements Criteria {

    public MaxBid() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> maximumBid = item.offers().stream()
                .filter(offer -> offer instanceof Bid)
                .max(Offer::compareTo);
        return maximumBid.isPresent() ? List.of(maximumBid.get()) : List.of();
    }

}
