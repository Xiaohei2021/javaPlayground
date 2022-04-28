import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Lets play a fun tic tac toe game!!");
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char turn = 'X';

//        char[] c = 'X' || 'O';
//        for(){}

        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");

        do {
//        while(true){
//            System.out.println("Please refer to the board above and pick a number/position to place your token");
//            input = scanner.nextInt();
    //        if () {
    //
    //        }
            do {
                System.out.println("Please refer to the board above and pick a number/position to place your token");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

            pos[input - 1] = turn;

            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");

            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
//        }
      }while( pos[i] != ' ' );
    }
}


