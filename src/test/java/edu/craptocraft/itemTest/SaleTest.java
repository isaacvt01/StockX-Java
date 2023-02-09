package edu.craptocraft.itemTest;

import edu.craptocraft.item.Ask;
import edu.craptocraft.item.Bid;
import edu.craptocraft.item.Sale;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SaleTest {
    static Sale sale;
    @BeforeClass
    public static void inicializar(){
        sale = new Sale("37", 900);
    }
    @Test
    public void constructorTest(){
        Assert.assertEquals("37", sale.size());
        Assert.assertEquals(900, sale.value());
    }
    @Test
    public void compareToTest(){
        Sale saleBaja = new Sale("55", 450);
        Sale saleAlta = new Sale("33", 1500);
        Sale saleIgual = new Sale("44", 900);
        Assert.assertEquals(1, sale.compareTo(saleBaja));
        Assert.assertEquals(-1, sale.compareTo(saleAlta));
        Assert.assertEquals(0, sale.compareTo(saleIgual));
    }
    @Test
    public void toStringTest(){
        String actual = sale.toString();
        String esperado = "\t\t37\t\t900\n";
        Assert.assertEquals(esperado, actual);
    }
}
