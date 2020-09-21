package facade;

public class DominoesShop {

    public String orderPizza(String type) {
        switch (type) {
            case "CHEESE_BURST": {
                CheeseBurstPizzaMaker cheeseBurstPizzaMaker = new CheeseBurstPizzaMaker();
                return cheeseBurstPizzaMaker.makePizza();
            }

            case "CHICKEN": {
                ChickenPizzaMaker chickenPizzaMaker = new ChickenPizzaMaker();
                return chickenPizzaMaker.makePizza();
            }

            case "PANEER": {
                PaneerPizzaMaker paneerPizzaMaker = new PaneerPizzaMaker();
                return paneerPizzaMaker.makePizza();
            }

            default: return "Such Pizza doesn't exist";
        }
    }
}
