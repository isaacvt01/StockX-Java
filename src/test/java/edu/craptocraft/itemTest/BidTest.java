package edu.craptocraft.itemTest;

import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Bid;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BidTest {
    static Bid bid;
    @BeforeClass
    public static void inicializar(){
        bid = new Bid("37", 900);
    }
    @Test
    public void constructorTest(){
        Assert.assertEquals("37", bid.size());
        Assert.assertEquals(900, bid.value());
    }
    @Test
    public void compareToTest(){
        Bid bidBaja = new Bid("55", 450);
        Bid bidAlta = new Bid("33", 1500);
        Bid bidIgual = new Bid("44", 900);
        Assert.assertEquals(1, bid.compareTo(bidBaja));
        Assert.assertEquals(-1, bid.compareTo(bidAlta));
        Assert.assertEquals(0, bid.compareTo(bidIgual));
    }
    @Test
    public void toStringTest(){
        String actual = bid.toString();
        String esperado = "\t\t37\t900\n";
        Assert.assertEquals(esperado, actual);
    }
}
