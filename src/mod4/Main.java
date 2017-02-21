package mod4;

import static mod4.Currency.EUR;
import static mod4.Currency.USD;

/**
 * Created by Alex on 11.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        //ong id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital)
        Bank usBank = new USBank(1, "USA", 15, 5000, 5, 500000);
        usBank.setCurrency(Currency.EUR);

        Bank euBank = new EUBank(2,"Europa",100,5000,3,15000000);
        euBank.setCurrency(EUR);

        User user = new User(1,"Alex", 100000, 8, "Estet", 5000, usBank);
        user.setBalance(5000);
        user.setBank(usBank);


        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(user, 500);

    }
}
