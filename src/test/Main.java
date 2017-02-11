package test;


public class Main {
    public static void main(String[] args) {

        Car honda = new Honda();    
        Car tesla = new Tesla();
        Person woman = new Woman(honda);
        Person man = new Man(tesla);
        Person boy = new Woman(honda);
        Person girl = new Girl(honda);


        woman.runDistance(499);
        woman.runDistance(2);
        woman.runDistance(1000);
        System.out.println();
        boy.runDistance(499);
        boy.runDistance(2);
        boy.runDistance(1000);
        //PersonOld person = Man();
        //person.runDistance(int 500);

    }
}
