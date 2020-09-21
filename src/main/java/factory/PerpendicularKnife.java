package factory;

public class PerpendicularKnife extends Knife{
    public PerpendicularKnife(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Perpendicular";
    }
}
