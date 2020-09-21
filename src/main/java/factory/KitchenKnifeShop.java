package factory;

public class KitchenKnifeShop extends KnifeShop{
    public KitchenKnifeShop(String name) {
        super(name);
    }

    @Override
    public Knife createKnife(String knifeType) {
        if (knifeType.equals("kitchen")) {
            return new KitchenKnife("kitchen");
        }
        return new ChoppingKnife("chopping");
    }
}
