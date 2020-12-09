package composite;

import java.util.List;

public class Building implements Structure {

    private String name;
    private String location;
    private List<Structure> rooms;

    public Building(String name, String location, List<Structure> rooms) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
    }

    @Override
    public String enter() {
        return "Enter Building";
    }

    @Override
    public String exit() {
        return "Exit Building";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String location() {
        return this.location;
    }

    public String enterRoom(int roomNumber) {
        Structure room = rooms.get(roomNumber);
        return room.enter();
    }

    public int addRooms(Structure room) {
        rooms.add(room);
        return rooms.size() - 1;
    }

    public void setRooms(List<Structure> rooms) {
        this.rooms = rooms;
    }
}
