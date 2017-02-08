package mod4;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Currency;

import static mod4.Currency.EUR;
import static mod4.Currency.USD;

/**
 * Created by Alex on 26.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        //id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital
        Bank usBank = new USBank(1,"USA",100, 500, 5,1000);
        usBank.setCurrency(mod4.Currency.EUR);


        //long id, String name, double balance, int mounceOfEmployment, String companyName, int salary, Bank bank
        User user = new User(1,"Vasia", 1500,8,"robota", 1000, usBank );
        user.setBalance(50000);
        user.setBank(usBank);

        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(user, 1100);


    }
}
