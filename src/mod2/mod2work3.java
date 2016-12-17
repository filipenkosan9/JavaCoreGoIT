package mod2;
import mod2.mod2work2;
public class mod2work3  {


   static int[] balances = {1200, 250, 2000, 500, 3200};
   static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    public static void main(String[] args) {

        String ownerName = "Ann";
        double withdrawal = 100;

            for (int i = 0; i < ownerName.length(); i++) {
                // підбирає імя і баланс,
                if (ownerNames[i].contains(ownerName) && (withdrawal + (withdrawal / 100 * 5) < balances[i])){
                    System.out.println(ownerNames[i] + " " + withdrawal + " " + mod2work2.withdrawal(balances[i], withdrawal));
                }
                else if (withdrawal + (withdrawal / 100 * 5) > balances[i]) System.out.println( ownerNames[i] + " NO");
            }
    }
}




