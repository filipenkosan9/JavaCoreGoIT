package mod4;

import java.util.*;

import static mod4.Currency.EUR;
import static mod4.Currency.USD;

/**
 * Created by Alex on 20.01.2017.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        //limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
        int limit = 0;
        if (getCurrency().equals(USD)){
            limit = 100;
        }else if (getCurrency().equals(EUR)){
            limit = 150;
        }
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        //        limit of funding - 5000 if EUR and 10000 if USD
        int limit = 0;

        if (getCurrency().equals(USD)){
            limit = 10000;
        }else if (getCurrency().equals(EUR)){
            limit = 5000;
        }

        return limit;
    }

    @Override
    int getMonthlyRate() {
        //        monthly rate - 1% with USD and 0% with EUR
        int rate = 0;
        if (getCurrency().equals(USD))
            rate = 1;

        return rate;
    }

    @Override
    int getCommission(int summ) {
        //        commision - 3% if USD and up to 1000, 5% if USD and more than 1000
//        10% if EUR and up to 1000 and 11% if EUR and more than 1000
        int comision = 0;
        if (getCurrency().equals(USD)){
            if (summ <= 1000) comision = 3;
            else comision = 5;
        }else if (getCurrency().equals(EUR)){
            if (summ <= 1000) comision = 10;
            else comision = 11;
        }

        return comision;
    }
}
