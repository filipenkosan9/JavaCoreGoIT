package mod2;

public class mod2work4 {

   public static int[] balances = {1200, 250, 2000, 500, 3200};
   public static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

         public static void main(String[] args) {
                String ownerName = "Oww";
                int fund = 100;

             System.out.println(ownerName + " " + fundBalance(ownerName,fund));
         }


                    public static int fundBalance(String ownerName, int fund) {
                        int fundBalance = 0;


                        for (int i = 0; i < ownerNames.length; i++) {
                            if (ownerNames[i].contains(ownerName) && fund >= 1) {
                                fundBalance = fund + balances[i];
                            }
                        }                         return fundBalance;
                    }}












/*for (int i = 0; i < ownerNames.length; i++) {
  if (ownerNames[i].contains(ownerName) && fund >= 1)
  System.out.println(ownerNames[i] + " " + (balances[i] + fund)) ;}*/
