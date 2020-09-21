package factory;

public class KitchenKnife extends Knife {
    public KitchenKnife(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Kitchen";
    }
}
