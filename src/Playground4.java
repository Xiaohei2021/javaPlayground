import java.util.Scanner;

public class Playground4 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dormaemon's omni-pouch");
        System.out.println("What is your age?");
        int age = userInput.nextInt();

        if (age < 16){
            System.out.println("Sowwee, but Doraemon is not here, so his pouch is not available at this moment.");
        }
        else if (age > 16 ){
            System.out.println("Hmmm, it seems like you have out grown the need for Doraemon.");
        }

        System.out.println("Would you like an Ice Cream? yes/no: ");
        String reply = userInput.next();

        if (age < 16 && reply.equals("yes")) {
            System.out.print("Okay, here is your yummy ice cream.");
        } else if (age > 16 || reply.equals("no")) {
            System.out.print("No problem, here is a cookie instead.");
        }
        else{
            System.out.println("Hmmm, please excuse me, but my gibberish level isn't adequet to understand you. Goodbye.");
        }
    }
}
