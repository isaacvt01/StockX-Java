package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.Sales;
import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Bid;
import edu.craptocraft.item.Sale;
import edu.craptocraft.item.Sneaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalesTest {
    private Sneaker sneaker;
    private Sales sales;
    @Before
    public void setUp() throws Exception {
        sales = new Sales();
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
    }

    @Test
    public void checkCriteria() {
        assertEquals(2, sales.checkCriteria(sneaker).size());
    }
}