package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.Bids;
import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Bid;
import edu.craptocraft.item.Sale;
import edu.craptocraft.item.Sneaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BidsTest {
    Sneaker sneaker;
    Bids bids;
    @Before
    public void setUp() throws Exception {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Bid("9.5", 440));
        sneaker.add(new Bid("9.5", 420));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        bids = new Bids();
    }

    @Test
    public void checkCriteria() {
        assertEquals(4, bids.checkCriteria(sneaker).size());
    }
}