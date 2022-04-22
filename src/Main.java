import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    int x = 20/(4-2);
//
//    System.out.println(x+9);

//        int x =  3;
//        int y = 6;
//
//        x = x+y*2+x;
//        System.out.println(x);

        System.out.println("What is your Name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(userName + " is a noob");


        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your Name  is " +  userName + " and your age is " + userAge + " years old!");

        System.out.println("\nHow tall are you in meters?");
        double userHeight= scanner.nextDouble();
        System.out.println("You are "+ userHeight + " meters tall.");

//        System.out.println(4.5-2.7);
//        System.out.print("Hello Peeps");
//        System.out.format("I have %d peach, %d blueBerry, %d apple, and 2 %s", 2, 10, 1, "banana");
//        System.out.format("\nI have %.1f pie", 4.5);
//        System.out.format("\n when formatted: %.1f", 4.5-2.7);

//        double averageMaleHeightDifference = userHeight -1.75;
//        double averageFemaleHeightDifference = userHeight -1.62;
//        System.out.println("\nThe difference between your height and teh average is: ");
//        System.out.format( "\n%.2f m if you are male.",averageMaleHeightDifference);
//        System.out.format( "\n%.2f m if you are female.",averageFemaleHeightDifference);


    }
}