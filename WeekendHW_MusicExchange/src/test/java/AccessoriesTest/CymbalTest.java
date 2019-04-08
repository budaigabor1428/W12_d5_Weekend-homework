package AccessoriesTest;

import Accessories.Cymbal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CymbalTest {

    Cymbal cymbal;

    @Before
    public void before() {
        cymbal = new Cymbal("Cymbal", "Zildjian", "Splash", "HGDY6475", 100.00, 120.00);
    }

    @Test
    public void hasType() {
        assertEquals("Cymbal", cymbal.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Zildjian", cymbal.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Splash", cymbal.getModel());
    }

    @Test
    public void hasSerialNumber() {
        assertEquals("HGDY6475", cymbal.getSerialNumber());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(100.00, cymbal.getUnitCost(), 0.01);
    }

    @Test
    public void hasSalesPrice() {
        assertEquals(120.00, cymbal.getSalesPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20.00, cymbal.calculateMarkup(), 0.01);
    }

}
