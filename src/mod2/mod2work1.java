package mod2;


public class mod2work1 {
        public static void main(String[] args) {

    int array[] ={9,6,1,4,3,7,10,11,8,2};
    double[] array2 = {11, 5.3, 4.5, 5.8, 6.5, 2.7, 8.5, 9.5, 10.5, 1.5};

    System.out.println("int sum: " + sum(array));
    System.out.println("double sum: " + sum(array2));
    System.out.println("int min: " + min(array));
    System.out.println("double min: " + min(array2));
    System.out.println("int max: " + max(array));
    System.out.println("double max: " + max(array2));
    System.out.println("int maxPositive: " + maxPositive(array));
    System.out.println("double maxPositive: " + maxPositive(array2));
    System.out.println("int modulus : " + modulus(array));
    System.out.println("double modulus : " + modulus(array2));
    System.out.println("int secondLARGEST : " + secondLargest(array));
    System.out.println("double secondLARGEST : " + secondLargest(array2));
    System.out.println("int multiplication: " + multiplication(array));
    System.out.println("double multiplication: " + multiplication(array2));


}

        public static int sum(int array[]) {
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i];
            }return sum;
        }
        public static double sum(double array[]) {
            double sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i];
            }return sum;
        }
        public static int min (int array[]){

            int min = array[0];

            for (int i = 0; i < array.length; i++){
                if (min > array[i] ) {
                    min = array[i];
                }}
            return min;
        }
        public static double min (double array[]){

            double min = array[0];

            for (int i = 0; i < array.length; i++){
                if (min > array[i] ) {
                    min = array[i];
                }}
            return min;
        }
        public static int max (int array[]){
            int max = array[0];
            for (int i = 0; i < array.length; i++){
                if (max < array[i] ) {
                    max = array[i];
                }} return max;
        }
        public static double max (double array[]){
            double max = array[0];
            for (int i = 0; i < array.length; i++){
                if (max < array[i] ) {
                    max = array[i];
                }} return max;
        }
        public static int maxPositive(int array[]){
            int maxPositive = max(array);
            if (maxPositive >= 0);
            return maxPositive;
        }
        public static double maxPositive(double array[]){
            double maxPositive = max(array);
            if (maxPositive >= 0);
            return maxPositive;
        }
        public static int modulus(int array[]) {
            int modulus = array[0] % array[array.length - 1];
            return modulus;
        }
        public static double modulus(double array[]) {
            double modulus = array[0] % array[array.length - 1];
            return modulus;
        }
        public static int secondLargest(int array[]){
            int secondLargest = array[0];
            for (int i = 0; i < array.length; i++){
                if (secondLargest < array[i] && array[i] != max(array))
                    secondLargest = array[i];
            }
            return secondLargest ;
        }
        public static double secondLargest(double array[]){
            double secondLargest = array[0];
            for (int i = 0; i < array.length; i++){
                if (secondLargest < array[i] && array[i] != max(array))
                    secondLargest = array[i];
            }
            return secondLargest ;
        }
        public static int multiplication(int array []){
            int mnojen9 = 1;
            for (int i = 0; i < array.length; i++ ){
                mnojen9 = mnojen9 * array[i];
            } return mnojen9;
        }
        public static double multiplication(double array []){
            double mnojen9 = 1;
            for (int i = 0; i < array.length; i++){
                mnojen9 *= array[i];
            }
            return mnojen9;
        }
}


