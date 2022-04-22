import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("First Name: ");
//        String firstName = scanner.next();
//
//        System.out.print("Age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Amount of money in your pocket: £");
//        double money = scanner.nextDouble();
//
//        System.out.println();
//
//        double moneyNeeded = Math.ceil(money) - money;
//
//        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
//        System.out.println("You've lived "  + age + " years. In another " + age + " years you'll be " + age*2 + " years old.");
//        System.out.println("Your name " + firstName + " has " + firstName.length() + " letters in it.");
//        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);


        Scanner scanner = new Scanner(System.in);

        System.out.print("The total amount for your meal is $");
        double totalBill = scanner.nextDouble();

        System.out.print("How many ways would your party like to split the bill?");
        int party = scanner.nextInt();

        System.out.print("Since the total bill  $ " + totalBill + " is being split " + party + " ways, each party's bill come out to be $ " + totalBill/party);

    }
}
