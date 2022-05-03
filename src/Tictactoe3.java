import java.util.Scanner;

public class Tictactoe3 {
    public static void main (String[] args){
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char token;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, lets play a fun tic tac toe game! Please pick a token, you can choose between X or O.");
        token = scanner.next().charAt(0);
       while(!(token == 'X')||(token == 'y')){
           System.out.println("Invalid entry, Please only pick between X or O.");
           token = scanner.next().charAt(0);
       }

        System.out.println("Perfect, you have chosen the " + token + " Token.");
        System.out.println("Please refer to the board below and place your token\n\n ");

        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();
        //        while(){
//
//        }

    }
}
