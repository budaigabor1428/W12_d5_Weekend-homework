package AccessoriesTest;

import Accessories.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void before() {
        musicSheet = new MusicSheet("Music Sheet", "Musician's Friend", "Classical Piano Pieces", "DFG123", 9.00, 10.00);
    }
    @Test
    public void hasType() {
        assertEquals("Music Sheet", musicSheet.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Musician's Friend", musicSheet.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Classical Piano Pieces", musicSheet.getModel());
    }

    @Test
    public void hasSerialNumber() {
        assertEquals("DFG123", musicSheet.getSerialNumber());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(9.00, musicSheet.getUnitCost(), 0.01);
    }

    @Test
    public void hasSalesPrice() {
        assertEquals(10.00, musicSheet.getSalesPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1.00, musicSheet.calculateMarkup(), 0.01);
    }
}
