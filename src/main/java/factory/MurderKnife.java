package factory;

public class MurderKnife extends Knife {
    public MurderKnife(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Murder";
    }
}
