import Accessories.GuitarString;
import Instruments.Guitar;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell item;


    @Before
    public void before() {
        item = new GuitarString("Guitar String", "Dunlop", "Super Bright","SH12345", 8.00, 9.00, 6);
        shop = new Shop ();

    }

    @Test
    public void canAddItems() {
        shop.addItem(item);
        assertEquals(1, shop.totalItems());
    }

    @Test
    public void canRemoveItems() {
        shop.addItem(item);
        shop.removeItem(item);
        assertEquals(0, shop.totalItems());
    }


}
