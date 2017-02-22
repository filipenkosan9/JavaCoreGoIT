package mod5;

import java.util.Date;

/**
 * Created by Alex on 20.02.2017.
 */
public class TripAdvisorAPI implements API {
    private Room [] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room = new Room(10, 500, 2, new Date(), "Trancilvania", "Washington");
        Room room2 = new Room(11, 800, 4, new Date(), "Trancilvania", "Washington");
        Room room3 = new Room(12, 1000, 8, new Date(), "Trancilvania", "Washington");
        Room room4 = new Room(13, 1200, 10, new Date(), "Trancilvania", "Washington");
        Room room5 = new Room(14, 1400, 29, new Date(), "Trancilvania", "Washington");

        rooms[0] = room;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
