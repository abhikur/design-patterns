package factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MurderKnifeShopTest {

    @Test
    public void shouldReturnUstraKnife() {
        KnifeShop murderShop = new MurderKnifeShop("Murder");
        Knife ustra = murderShop.createKnife("ustra");

        assertEquals(ustra.type(), "Ustra");
    }

    @Test
    public void shouldReturnPerpendicularKnifeWhenTypePerpendicularIsGiven() {
        KnifeShop murderShop = new MurderKnifeShop("Murder");
        Knife ustra = murderShop.createKnife("perpendicular");

        assertEquals(ustra.type(), "Perpendicular");
    }
}