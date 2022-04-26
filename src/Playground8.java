import java.util.Scanner;

public class Playground8 {
    public static void main(String[] args){
        /*double[] foo = {0,0,0};
        double[] bar = new double[3];
        double[] foobar = {0.6, 22.81, 87.555};

        bar[0]= 98.1;
        bar[1]= 56.3;
        bar[2]= 13.69;

        System.out.println(bar[1]);*/

        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];
        words[0] = "woot";
        words[1] = "yay";
        words[2] = "hooray";

        System.out.println("please enter choose a word # 1, 2, or 3");
        int num = scanner.nextInt();

        System.out.println("you have chosen word #" + num + " and the word is " + words[num-1]);

    }

}
