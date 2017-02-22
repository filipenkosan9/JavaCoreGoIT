package mod5;

import java.util.Date;

/**
 * Created by Alex on 20.02.2017.
 */
public class GoogleAPI implements API {
   private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room = new Room(20,200,1, new Date(), "Alexando", "Lisboa");
        Room room2 = new Room(30,400,1, new Date(), "Alexando", "Lisboa");
        Room room3 = new Room(40,400,2, new Date(), "Alexando", "Lisboa");
        Room room4 = new Room(50,600,2, new Date(), "Alexando", "Lisboa");
        Room room5 = new Room(60,600,3, new Date(), "Alexando", "Lisboa");

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
