package mod2;
public class mod2work2 {
    public static void main(String[] args) {
        //
        int balance = 1500;
        int withdrawal = 100;


        if(withdrawal +(withdrawal / 100 * 5) > balance)
            System.out.println("NO!!!");
        else

        System.out.println("OK, " + withdrawal / 100 * 5 + ", " + withdrawal(balance,withdrawal));


}
    public static double withdrawal (int balance, double withdrawal){
        double procent = withdrawal / 100 * 5;
        double ostatok = balance - withdrawal - procent;

        return ostatok;
    }
}


