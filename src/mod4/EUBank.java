package mod4;

import java.util.*;

import static mod4.Currency.EUR;
import static mod4.Currency.USD;

/**
 * Created by Alex on 20.01.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    /*EUBank:
            */
    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        //    limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
        if (getCurrency().equals(USD)) {
            limit = 2000;
        } else if (getCurrency().equals(EUR))
            limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        //limit of funding - 20000 if EUR and 10000 if USD
        int limit = 0;
        if (getCurrency().equals(USD)) {
            limit = 10000;
        } else if (getCurrency().equals(EUR))
            limit = 20000;
        return limit;
    }


    @Override
    int getMonthlyRate() {
        //    monthly rate - 0% with USD and 1% with EUR
        int rate = 0;
        if (getCurrency().equals(USD));
        else rate = 1;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        //    commision - 5% if USD and up to 1000, 7% if USD and more than 1000
        //      2% if EUR and up to 1000 and 4% if EUR and more than 1000
        // ЧТО ? ГДЕ ? КОГДА ?
        int comission = 0;
        if (getCurrency().equals(USD)){
            if (summ <= 1000)
                comission = 5;
            else
                comission = 7;
        }else if (getCurrency().equals(EUR)){
            if (summ <= 1000) {
                comission = 2;
            }else comission = 4;
        }
        return comission;
    }
}
