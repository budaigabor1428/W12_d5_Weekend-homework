package InstrumentTest;

import Accessories.GuitarString;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Guitar String", "Dunlop", "Super Bright","SH12345", 8.00, 9.00, 6);
        guitar = new Guitar("Guitar", "Fender", "Stratocaster", "White", "EHD3456", 560.00, 660.00, 6, guitarString);
    }

    @Test
    public void hasType() {
        assertEquals("Guitar", guitar.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("White", guitar.getColour());
    }

    @Test
    public void hasSerialNumber() {
        assertEquals("EHD3456", guitar.getSerialNumber());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(560.00, guitar.getUnitCost(), 0.01);
    }

    @Test
    public void hasSalesPrice() {
        assertEquals(660.00, guitar.getSalesPrice(), 0.01);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100.00, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canMakeSound() {
        assertEquals("Guitar sound!", guitar.makesSound());
    }

}
