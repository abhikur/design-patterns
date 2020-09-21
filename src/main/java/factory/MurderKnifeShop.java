package factory;

public class MurderKnifeShop extends KnifeShop {
    public MurderKnifeShop(String name) {
        super(name);
    }

    @Override
    public Knife createKnife(String knifeType) {
        if (knifeType.equals("ustra")) {
            return new UstraKnife("ustra");
        }
        return new PerpendicularKnife("perpendicular");
    }
}
