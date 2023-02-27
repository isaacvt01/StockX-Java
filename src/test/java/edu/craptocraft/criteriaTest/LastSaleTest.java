package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.LastSale;
import edu.craptocraft.item.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastSaleTest {

    private Sneaker sneaker;

    private LastSale lastSale;

    @Before
    public void setUp() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        lastSale = new LastSale();
    }

    @Test
    public void checkCriteria() {
        Offer sale = lastSale.checkCriteria(sneaker).get(0);
        assertEquals(360, sale.value());
        assertEquals(1, lastSale.checkCriteria(sneaker).size());
    }
}