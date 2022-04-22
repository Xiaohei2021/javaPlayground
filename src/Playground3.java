import java.util.Scanner;
public class Playground3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to a boring world");
        System.out.print("Please enter your height in cm: ");
        int height = scanner.nextInt();

        if (height < 130){
            System.out.println("Your height is below average");
        }
        else if (height <= 150){
            System.out.println("Your height is about average");
        }
        else{
            System.out.println("Holy cow, you are tall");
        }
    }
}
