package facade;

public class ChickenPizzaMaker implements Pizza {

    @Override
    public String makePizza() {
        return "Chicken Pizza";
    }
}