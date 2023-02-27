package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.MaxBid;
import edu.craptocraft.criteria.MinAsk;
import edu.craptocraft.item.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxBidTest {
    private Sneaker sneaker;
    private MaxBid maxBid;
    @Before
    public void setUp() throws Exception {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        maxBid = new MaxBid();
    }

    @Test
    public void checkCriteria() {
        Offer bid = maxBid.checkCriteria(sneaker).get(0);
        assertEquals(480, bid.value());
    }
}