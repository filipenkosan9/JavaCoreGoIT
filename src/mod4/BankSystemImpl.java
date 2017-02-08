package mod4;

/**
 * Created by Alex on 25.01.2017.
 */
public class BankSystemImpl implements BankSystem{
    @Override
    public void withdrawOfUser(User user, int amount) {
        // Что? Где?  Когда ?
        Bank userBank = user.getBank();
        double rate = userBank.getCommission(amount)/ 100;

        if (amount + amount * rate  < userBank.getLimitOfWithdrawal())
            user.setBalance( user.getBalance() - (amount + amount * rate) );
    }

    @Override
    public void fundUser(User user, int amount) {
    Bank userBank = user.getBank();
        if (amount <= userBank.getLimitOfFunding() ) System.out.println("Ok");
        else System.out.println("Summa very big");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank = fromUser.getBank();
        double comission = (double) userBank.getCommission(amount);
        fromUser.setBalance(fromUser.getBalance() - amount - comission);
        toUser.setBalance(toUser.getBalance() + amount);

    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double comission = (double) userBank.getCommission(user.getSalary());
        user.setBalance(user.getBalance() + (user.getSalary() - comission));

    }
}
