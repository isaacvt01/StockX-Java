package edu.craptocraft.criteria;

import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;
import java.util.Optional;

public class Min implements Criteria{
    Criteria firstCriteria;
    Criteria secondCriteria;
    public Min(Criteria size, Criteria asks) {
        this.firstCriteria = size;
        this.secondCriteria = asks;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteriaItem = firstCriteria.checkCriteria(item);
        List<Offer> secondCriteriaItem = secondCriteria.checkCriteria(item);

        Optional<Offer> finalCriteria = firstCriteriaItem.stream()
                .filter(offer -> secondCriteriaItem.contains(offer))
                .min(Offer::compareTo);
        return finalCriteria.isPresent()?List.of(finalCriteria.get()):List.of();
    }
}
