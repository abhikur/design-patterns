package composite;

public class Room implements Structure {

    private String name;
    private String location;

    public Room(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String enter() {
        return "Enter Room " + name;
    }

    @Override
    public String exit() {
        return "Exit Room" + name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String location() {
        return this.location;
    }
}
