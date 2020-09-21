package factory;

public abstract class KnifeShop {

    private String name;

    public KnifeShop(String name) {
        this.name = name;
    }

    public abstract Knife createKnife(String knifeType);

    public String orderKnife(String order) {
        return order;
    }
}
