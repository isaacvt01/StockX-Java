package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.*;
import edu.craptocraft.item.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    private Size size;

    private Sneaker sneaker;
    private Bids bids;
    Max max;

    @Before
    public void setUp() throws Exception {
        size = new Size("9.5");
        bids = new Bids();
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        max = new Max(size, bids);
    }

    @Test
    public void checkCriteria() {
        assertEquals(1, max.checkCriteria(sneaker).size());
    }
}