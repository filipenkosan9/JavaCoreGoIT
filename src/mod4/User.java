package mod4;

/**
 * Created by Alex on 20.01.2017.
 */
public class User {
     private long id;
     private String name;
     private double balance;
     private int mounceOfEmployment;
     private String companyName;
     private int salary;
     private Bank bank;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", mounceOfEmployment=" + mounceOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
