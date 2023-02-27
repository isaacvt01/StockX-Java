package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.MinAsk;
import edu.craptocraft.item.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinAskTest {
    private Sneaker sneaker;
    private MinAsk minAsk;
    @Before
    public void setUp() throws Exception {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        minAsk = new MinAsk();
    }

    @Test
    public void checkCriteria() {
        Offer ask = minAsk.checkCriteria(sneaker).get(0);
        assertEquals(330,ask.value());
        assertEquals(1, minAsk.checkCriteria(sneaker).size());
    }
}