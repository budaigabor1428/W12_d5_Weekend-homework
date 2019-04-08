package InstrumentTest;

import Accessories.Cymbal;
import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;
    Cymbal cymbal;

    @Before
    public void before() {
        cymbal = new Cymbal("Cymbal", "Zildjian", "Splash", "HGDY6475", 100.00, 120.00);
        drum = new Drum("Drum", "Tama", "Star Classic", "Black", "EHDG7465", 979.00, 1000.00, 3, 0, 1);
    }

    @Test
    public void hasType() {
        assertEquals("Drum", drum.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Tama", drum.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Star Classic", drum.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void hasSerialNumber() {
        assertEquals("EHDG7465", drum.getSerialNumber());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(979.00, drum.getUnitCost(), 0.01);
    }

    @Test
    public void hasSalesPrice() {
        assertEquals(1000.00, drum.getSalesPrice(), 0.01);
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(21.00, drum.calculateMarkup(), 0.01);
    }

    @Test
    public void hasNumberOfToms() {
        assertEquals(3, drum.getNumberOfToms());
    }

    @Test
    public void hasNumberOfCymbals() {
        assertEquals(0, drum.getNumberOfCymbals());
    }

    @Test
    public void hasNumberOfKickDrums() {
        assertEquals(1, drum.getNumberOfKickDrums());
    }

    @Test
    public void cymbalsStartsEmpty() {
        assertEquals(0, drum.getNumberOfCymbals());
    }

    @Test
    public void canAddCymbals() {
        drum.addCymbal(cymbal);
        assertEquals(1, drum.getNumberOfAdditionalCymbals());
    }

    @Test
    public void canMakeSound() {
        assertEquals("Drumroll!", drum.makesSound());
    }

}
