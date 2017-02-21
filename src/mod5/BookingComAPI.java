package mod5;

import java.util.Date;

/**
 * Created by Alex on 20.02.2017.
 */
public class BookingComAPI implements API{
    private Room [] rooms = new Room[5];

    public BookingComAPI() {
        Room room = new Room(1, 500, 2, new Date(),"Pencilvania", "New - York");
        Room room2 = new Room(2, 500, 2, new Date(),"Pencilvania", "New - York");
        Room room3 = new Room(3, 600, 3, new Date(),"Pencilvania", "New - York");
        Room room4 = new Room(4, 700, 4, new Date(),"Pencilvania", "New - York");
        Room room5 = new Room(5, 900, 6, new Date(),"Pencilvania", "New - York");

        rooms[0] = room;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        rooms[7] = room4;
}

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];

            }
    }
