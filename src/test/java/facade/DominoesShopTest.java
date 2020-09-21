package facade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominoesShopTest {

    @Test
    public void shouldGetPaneerPizza() {
        DominoesShop dominoesShop = new DominoesShop();
        assertEquals(dominoesShop.orderPizza("PANEER"), "Paneer Pizza");
    }

    @Test
    public void shouldGetChickenPizza() {
        DominoesShop dominoesShop = new DominoesShop();
        assertEquals(dominoesShop.orderPizza("CHICKEN"), "Chicken Pizza");
    }

    @Test
    public void shouldGetCheeseBurstPizza() {
        DominoesShop dominoesShop = new DominoesShop();
        assertEquals(dominoesShop.orderPizza("CHEESE_BURST"), "Cheese Burst");
    }

    @Test
    public void shouldGetMacroniPizza() {
        DominoesShop dominoesShop = new DominoesShop();
        assertEquals(dominoesShop.orderPizza("LALALAAL"), "Such Pizza doesn't exist");
    }
}