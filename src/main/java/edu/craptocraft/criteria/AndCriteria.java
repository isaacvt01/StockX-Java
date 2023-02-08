package edu.craptocraft.criteria;

import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria {

    private Criteria secondCriteria;
    private Criteria firstCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.secondCriteria = secondCriteria;
        this.firstCriteria = firstCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> firstCriteriaItems = firstCriteria.checkCriteria(item);
        List<Offer> secondCriteriaItems = secondCriteria.checkCriteria(item);
        return  firstCriteriaItems.stream()
                .filter(offer ->  secondCriteriaItems.contains(offer) )
                .collect(Collectors.toList());
    }
}
