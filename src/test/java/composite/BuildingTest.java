package composite;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    private Structure playingRoom = new Room("PlayingRoom", "GomtiNagar");
    private Structure kitchen = new Room("Kitchen", "Kapoorthala");
    private Building building = new Building(
            "Shalimar", "Lucknow", new ArrayList<>());

    @Test
    public void shouldEnterTheBuildingAndGoToPlayingRoom () {
        int roomNumber = building.addRooms(playingRoom);
        assertEquals("Enter Room PlayingRoom",building.enterRoom(roomNumber));
    }
}