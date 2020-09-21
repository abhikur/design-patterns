package factory;

public class UstraKnife extends Knife{
    public UstraKnife(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Ustra";
    }
}
