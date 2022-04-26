import java.util.Arrays;
import java.util.Scanner;

public class Playground9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("SoyBean transporter: please enter how many crates you have");
        int crates = scanner.nextInt();

        double[] tonsPerCrate = new double[crates];

        for (int i =0; i < crates; i++){
            System.out.println("Please enter how many tons of soy beans per crates: ");
            tonsPerCrate[i]=scanner.nextDouble();
        }
//        System.out.println(Arrays.toString(tonsPerCrate));

        double heaviestCrate = tonsPerCrate[0];
        for (int i = 1; i < tonsPerCrate.length; i++){
            if (tonsPerCrate[i] > heaviestCrate){
                heaviestCrate = tonsPerCrate[i];
            }
        }
        System.out.println("The heavies weigning crate weighs" + heaviestCrate);


    }
}
