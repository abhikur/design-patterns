package adaptor;

public class CoffeeMachine implements CoffeeMachineInterface {

    private OldCoffeeMachine oldCoffeeMachine;

    @Override
    public String selectExpressFromMachine(String numberOfServings) {
        return oldCoffeeMachine.selectExpresso(Integer.valueOf(numberOfServings));
    }

    public void connect(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }
}
