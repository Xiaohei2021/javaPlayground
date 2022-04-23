import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge3 {
    public static void main(String[] args){
//        int x = 17;
//        int y = 15;
//
//        if (x>y == true ){
//            System.out.println("X is bigger than Y");
//            int dif = x-y;
//            System.out.println("The difference between x and y is " + dif);
//        } else if (x == y) {
//            System.out.println("X and Y are equal");
//        } else{
//            System.out.println("Y is bigger than x");
//        }
        Scanner userInput = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("Please pick a number from 1-5");
        int number = userInput.nextInt();

//        if ( number == randomNumber){
//            System.out.println("Correct! Aren’t you lucky.");
//        }else {
//            System.out.println("Hard luck! Maybe next time.");
//        }
        if ( number != randomNumber){
            System.out.println("Close, try again! ");
            System.out.println("Please pick a number from 1-5");
            int number2 = userInput.nextInt();

            if ( number2 == randomNumber) {
                System.out.println("Correct! Aren’t you lucky.");
            }
            else{
                System.out.println("Hard luck! Maybe next time.");
            }
        }else {
            System.out.println("Correct! Aren’t you lucky.");
        }

    }
}
