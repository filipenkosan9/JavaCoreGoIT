package mod5;

/**
 * Created by Alex on 20.02.2017.
 */
public class Controller {

    private API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis[0] = bookingComAPI;
        apis[1] = googleAPI;
        apis[2] = tripAdvisorAPI;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel){
        // найти всі кінати з заданими параметрами в всіх інтерфейсах

        return new Room[0];
    }

    Room[] check(API api1, API api2){
        return new Room[0];
    }

}
