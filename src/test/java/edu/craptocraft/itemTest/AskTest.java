package edu.craptocraft.itemTest;

import edu.craptocraft.item.Ask;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AskTest {
    Ask ask;
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
        Assert.assertEquals(0, ask.compareTo(askBaja));
    }
    @Test
    public void toStringTest(){
        String actual = ask.toString();
        String esperado = "\t\t37\t900\n";
        Assert.assertEquals(esperado, actual);
    }

}
