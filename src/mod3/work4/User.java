package mod3.work4;


public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, String currency, int salary, int monthsOfEmployment, int balance, String companyName) {
        this.name = name;
        this.currency = currency;
        this.salary = salary;
        this.monthsOfEmployment = monthsOfEmployment;
        this.balance = balance;
        this.companyName = companyName;
    }
    int withdraw(int summ){
        if(summ < 1000)
            this.balance = this.balance - (summ + (summ * (5/100)));
        else
            this.balance = this.balance - (summ + (summ * (10/10)));
        return this.balance;
    }

    int monthIncreaser(int addMonth){
        return this.monthsOfEmployment += addMonth;
    }

    int companyNameLenght(){
        return this.companyName.length();
    }

     void paySalary(){
        this.balance += this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
