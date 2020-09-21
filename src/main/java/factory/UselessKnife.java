package factory;

public class UselessKnife extends Knife {
    public UselessKnife(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Useless";
    }
}
