import java.util.Scanner;

public class TicTacToe2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char symbol;
        int move;


        System.out.println("Hey there, lets play a fun tic tac toe game!!");
        System.out.println("Which symbol would you like use, X or O?");
        symbol = scanner.next().charAt(0);

        do {
            System.out.println("Incorrect input. Please only enter 'X' or 'O'.");
            System.out.println("capital X or capital O");
            symbol = scanner.next().charAt(0);
        } while (!(symbol == 'X' || symbol == 'O'));

        System.out.println("Nice, you have chosen to be " + symbol + ". You will be making the first move.");

            /*if (!(symbol == 'X' || symbol == 'O')){

                do {
                    System.out.println("In correct, input. Please only enter 'X' or 'O'.");
                    System.out.println("capital X or capital O");
                    symbol = scanner.next().charAt(0);
                } while (!(symbol == 'X' || symbol == 'O'));
            }
            else{
                System.out.println("Nice, you have chosen to be " + symbol);
            }*/

//            int currentTurn = 1;

//            char[] c = 'X' || 'O';
//            for(){}

        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");

//       while(){
//
//        }

        do {
            System.out.println("Please refer to the board above and pick a number/position between 1 -9 and place your token");
            input = scanner.nextInt();
            if () {

            }
        }while( move <= 9 );

       /*for (int i = 0; i < pos.length; i++){
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

       }*/


    }

}
