package edu.craptocraft.itemTest;

import edu.craptocraft.item.Sneaker;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
