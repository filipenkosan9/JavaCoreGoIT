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
        rooms[3] = room2;
        rooms[4] = room5;

}

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countRooms = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice()  == price )
              if (rooms[i].getPersons() == persons)
                  if( rooms[i].getCityName() == city)
                      if(rooms[i].getHotelName() == hotel){
                        countRooms++;
            }
        }

        Room[] result = new Room[countRooms];

        int index = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice()  == price )
                if (rooms[i].getPersons() == persons)
                    if( rooms[i].getCityName() == city)
                        if(rooms[i].getHotelName() == hotel){
                            result[index] = rooms[i];
                            index++;
                        }
        }

        return result;
        }
    }
