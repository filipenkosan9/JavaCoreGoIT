package mod4;

import static mod4.Currency.EUR;
import static mod4.Currency.USD;

/**
 * Created by Alex on 20.01.2017.
 */
public class USBank extends Bank {


    public USBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (getCurrency().equals(USD)) {
            limit = 1000;
        } else if (getCurrency().equals(EUR))
            limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit = 0;
        if (getCurrency().equals(USD)) {
            limit = Integer.MAX_VALUE;
        } else if (getCurrency().equals(EUR))
            limit = 10000;
        return limit;
    }

    // monthly rate - 1% with USD and 2% with EUR
    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (getCurrency().equals(USD)) {
            rate = 1;
        } else if (getCurrency().equals(EUR))
            rate = 2;
        return rate;

    }

    /*
        commision - 5% if USD and up to 1000, 7% if USD and more than 1000
        6% if EUR and up to 1000 and 8% if EUR and more than 1000
    */
    @Override
    int getCommission(int summ) {
        int commision = 0;
        if (getCurrency().equals(USD)) {
            //commision - 5% if USD and up to 1000, 7% if USD and more than 1000
            if (summ <= 1000)
                commision = 5;
             else if (summ > 1000)
                commision = 7;
        }else if(getCurrency().equals(EUR)){
            if (summ <= 1000)
                commision = 6;
            else commision = 8;
        }
        return commision;
    }
}
