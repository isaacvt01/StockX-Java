package edu.craptocraft.criteriaTest;

import edu.craptocraft.criteria.*;
import edu.craptocraft.item.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AndCriteriaTest {


    private Item item;
    private Size size;

    private Sales sales;
    AndCriteria andCriteria;

    Item sneaker;
    @Before
    public void setUp() {
        // Inicializar objetos necesarios para la prueba

        size = new Size("9.5");
        sales = new Sales();
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));

        andCriteria = new AndCriteria(sales,size);
    }

    @Test
    public void checkCriteriaTest() {

        assertEquals(1, andCriteria.checkCriteria(sneaker).size());

    }
}