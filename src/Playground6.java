import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Playground6 {
    public static void main(String[] args){
//        for (int i = 0; i < 5; i++ ){
//            System.out.println("Testing For Loop");
//        }

//        System.out.println();

        Scanner input = new Scanner(System.in);
        String reply;
        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("your rolled a " + num);
            System.out.print("Roll again? y/n: ");
            reply = input.next();
        }while (reply.equals("y"));

//        int i = 0;
//        do {
//            i++;
//            System.out.println(i);
//        }while(i<5);

//         while(i < 6){
//             System.out.println("Testing while loop");
//             i++;
//         }
    }
}
