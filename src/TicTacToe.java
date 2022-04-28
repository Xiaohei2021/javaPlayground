import java.util.Scanner;

public class TicTacToe {
    /*public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Lets play a fun tic tac toe game!!");
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char turn = 'X';
        int currentTurn = 1;

        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");

        while (true) {

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

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn ||
                    pos[3] == turn && pos[4] == turn && pos[5] == turn ||
                    pos[6] == turn && pos[7] == turn && pos[8] == turn ||
                    pos[0] == turn && pos[3] == turn && pos[6] == turn ||
                    pos[1] == turn && pos[4] == turn && pos[7] == turn ||
                    pos[2] == turn && pos[5] == turn && pos[8] == turn ||
                    pos[0] == turn && pos[4] == turn && pos[8] == turn ||
                    pos[2] == turn && pos[4] == turn && pos[6] == turn
            ) {
                System.out.println("Congrats, Player " + turn + " is the winner");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }

            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("Draw Game");
            }

        }
    }*/

        public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);
            int input;

            System.out.println("Hey there, lets play a fun tic tac toe game!!");

            char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char turn = 'X';
//            int currentTurn = 1;

//            char[] c = 'X' || 'O';
//            for(){}

            System.out.println(" 1 | 2 | 3 ");
            System.out.println("---+---+---");
            System.out.println(" 4 | 5 | 6 ");
            System.out.println("---+---+---");
            System.out.println(" 7 | 8 | 9 ");

            for (int i = 0; i < pos.length; i++){
                while(i < 9 ){
                    System.out.println("Please refer to the board above and pick a number/position to place your token");
                    input = scanner.nextInt();

                    pos[input - 1] = turn;

                    System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
                    System.out.println("---+---+---");
                    System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
                    System.out.println("---+---+---");
                    System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");

                    if (pos[0] == turn && pos[1] == turn && pos[2] == turn ||
                            pos[3] == turn && pos[4] == turn && pos[5] == turn ||
                            pos[6] == turn && pos[7] == turn && pos[8] == turn ||
                            pos[0] == turn && pos[3] == turn && pos[6] == turn ||
                            pos[1] == turn && pos[4] == turn && pos[7] == turn ||
                            pos[2] == turn && pos[5] == turn && pos[8] == turn ||
                            pos[0] == turn && pos[4] == turn && pos[8] == turn ||
                            pos[2] == turn && pos[4] == turn && pos[6] == turn) {

                    }

                }

            }

//            do {
//                System.out.println("Please refer to the board above and pick a number/position to place your token");
//                input = scanner.nextInt();
//                if () {
//
//                }
//          }while( pos[i] != ' ' );
    }
}


