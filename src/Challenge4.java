import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge4 {
    public static void main(String[] args){
//        for(int i =89; i<118; i++){
//            System.out.println(i);
//        }

//        int count = 1;
//        for (int i = 1; i <=40; i ++){
//            System.out.println(i);
//
//            if (count == 3 ){
//                System.out.println("Quack");
//                count = 0 ;
//            }
//
//            count++;
//
//        }
       /* int i = 0;
        int count = 0;
        do{
            i++;

            if (count ==3 ){
                System.out.println("Quack");
                count = 0;
            }
            count++;
            System.out.println(i);
        }while(i<41);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a password: ");
        String userPassword = scanner.next();
        String password = "shark50";

        if (userPassword.equals(password)){
            System.out.println("ACCESS APPROVED");
        }
        else{
            System.out.print("ACCESS DENIED");
        }*/

        /*Scanner scanner = new Scanner(System.in);

        String password = "shark50";
        String userPassword;
        do {
            System.out.print("Please enter a password: ");
             userPassword = scanner.next();
             if (!userPassword.equals(password)){
                 System.out.println("ACCESS DENIED");
             }
        }while (!userPassword.equals(password) );
        System.out.print("ACCESS APPROVED");*/

//        for(int i = 1; i < 11; i++){
//            System.out.println(i);
//        }
    Scanner scanner = new Scanner(System.in);
    int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
    int input;
    int guesses= 0;

    do {
        System.out.print("Please enter a number between 1 -100: ");
        input = scanner.nextInt();

        guesses++;

        if (input < 0 || input > 100){
            System.out.println("You did not pick a number that is between 1- 100, please a number within the given range ");
        }

        else if(input > randomNumber){
            System.out.println("Close, Try guessing Lower");
        }

        else if(input < randomNumber){
            System.out.println("Close, Try guessing higher");
        }

        else{
            System.out.println("Hooray, the number is " + input + ". You guessed it Correctly!");
            System.out.println("Congrats, you guessed the nu50mber correctly in " + guesses + " tries!");
        }
    }while(input != (randomNumber));

    }
}
