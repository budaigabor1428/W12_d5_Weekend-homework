package AccessoriesTest;

import Accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {

        guitarString = new GuitarString("Guitar String", "Dunlop", "Super Bright","SH12345", 8.00, 9.00, 6);
    }


    @Test
    public void hasType() {
        assertEquals("Guitar String", guitarString.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Dunlop", guitarString.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Super Bright", guitarString.getModel());
    }

    @Test
    public void hasSerialNumber() {
        assertEquals("SH12345", guitarString.getSerialNumber());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(8.00, guitarString.getUnitCost(), 0.01);
    }

    @Test
    public void hasSalesPrice() {
        assertEquals(9.00, guitarString.getSalesPrice(), 0.01);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitarString.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1.00, guitarString.calculateMarkup(), 0.01);
    }
}

