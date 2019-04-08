package InstrumentTest;

import Accessories.GuitarString;
import Instruments.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    BassGuitar bassGuitar;
    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Bass String", "Dunlop", "Super Bright","SH12345", 8.00, 9.00, 6);
        bassGuitar = new BassGuitar("Bass Guitar", "Fender", "Jazz Bass", "Red", "EHD3445", 399.00, 500.00, 4, guitarString);
    }

    @Test
    public void hasType() {
        assertEquals("Bass Guitar", bassGuitar.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Fender", bassGuitar.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Jazz Bass", bassGuitar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", bassGuitar.getColour());
    }

    @Test
    public void hasSerialNumber() {
        assertEquals("EHD3445", bassGuitar.getSerialNumber());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(399.00, bassGuitar.getUnitCost(), 0.01);
    }

    @Test
    public void hasSalesPrice() {
        assertEquals(500.00, bassGuitar.getSalesPrice(), 0.01);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, bassGuitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(101.00, bassGuitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canMakeSound() {
        assertEquals("Broom, broom!", bassGuitar.makesSound());
    }

}
