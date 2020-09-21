package factory;

public class ChoppingKnife extends Knife {
    public ChoppingKnife(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Chopping";
    }
}
