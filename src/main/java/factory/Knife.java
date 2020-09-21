package factory;

public abstract class Knife {

    private String name;

    public Knife(String name) {
        this.name = name;
    }

    public abstract String type();
}
