package edu.craptocraft.criteria;

import edu.craptocraft.item.Item;
import edu.craptocraft.item.Offer;

import java.util.List;

public interface Criteria {
    public List <Offer> checkCriteria(Item item);
}
