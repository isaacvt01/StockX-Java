package edu.craptocraft.itemTest;

import edu.craptocraft.item.Ask;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AskTest {
    static Ask ask;
    @BeforeClass
    public static void inicializar(){
        ask = new Ask("37", 900);
    }
    @Test
    public void constructorTest(){
        Assert.assertEquals("37", ask.size());
        Assert.assertEquals(900, ask.value());
    }
    @Test
    public void compareToTest(){
        Ask askBaja = new Ask("55", 450);
        Ask askAlta = new Ask("33", 1500);
        Ask askIgual = new Ask("44", 900);
        Assert.assertEquals(1, ask.compareTo(askBaja));
        Assert.assertEquals(-1, ask.compareTo(askAlta));
        Assert.assertEquals(0, ask.compareTo(askIgual));
    }
    @Test
    public void toStringTest(){
        String actual = ask.toString();
        String esperado = "\t\t37\t900\n";
        Assert.assertEquals(esperado, actual);
    }

}
