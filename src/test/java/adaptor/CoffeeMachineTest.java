package adaptor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeMachineTest {

    @Test
    public void shouldGetExpressoCoffeeUsingOldMachine() {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.connect(oldCoffeeMachine);

        assertEquals("2 Expresso", coffeeMachine.selectExpressFromMachine("2"));
    }
}