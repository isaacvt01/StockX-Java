package edu.craptocraft.itemTest;

import edu.craptocraft.item.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class SneakerTest {
    static Sneaker sneaker;
    @BeforeClass
    public static void inicializar(){
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void constructorTest(){
        String esperadoStyle = "555088-105";
        String devueltoStyle = sneaker.getStyle();
        Assert.assertEquals(esperadoStyle, devueltoStyle);
        String esperadoName = "Jordan 1 Retro High Dark Mocha";
        String devueltoName = sneaker.getName();
        Assert.assertEquals(esperadoName, devueltoName);
    }
    @Test
    public void addTest(){
        Offer bid = new Bid("33", 4);
        Offer ask = new Ask("34", 6);
        Offer sale = new Sale("88", 9);

        sneaker.add(bid);
        sneaker.add(ask);
        sneaker.add(sale);
        List<Offer> ofertas = sneaker.offers();
        Assert.assertEquals(ofertas.get(0).getClass(), bid.getClass());
        Assert.assertEquals(ofertas.get(1).getClass(), ask.getClass());
        Assert.assertEquals(ofertas.get(2).getClass(), sale.getClass());
    }
    @Test
    public void toStringTest(){
        String esperado = "Jordan 1 Retro High Dark Mocha\n\t\t\t555088-105";
        String actual = sneaker.toString();
        Assert.assertEquals(esperado, actual);
    }
}
