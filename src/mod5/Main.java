package mod5;

import java.util.Date;

/**
 * Created by Alex on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        API booking = new BookingComAPI();
        for (Room room : booking.findRooms(500, 2, "New - York", "Pencilvania")) {
            System.out.println(room);
        }


    }
}
