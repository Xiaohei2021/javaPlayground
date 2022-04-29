import java.util.Scanner;

public class TicTacToe2 {
    //There are two game pieces X or O
    // There should only be 9 moves
    // There will be a winner if 3 position are the same games pieces
    //The game is a draw if all 9 position are taken
    public static boolean main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        char symbol;
        int move;
        int turn;
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        System.out.println("Hey there, lets play a fun tic tac toe game!!");
        System.out.println("Which symbol would you like use, X or O?");
        symbol = scanner.next().charAt(0);
//        do {
//            System.out.println("Incorrect input. Please only enter 'X' or 'O'.");
//            System.out.println("capital X or capital O");
//            symbol = scanner.next().charAt(0);
//        } while (!(symbol == 'X' || symbol == 'O'));
//        System.out.println("Nice, you have chosen to be " + symbol + ". You will be making the first move. \n");

        if (!(symbol == 'X' || symbol == 'O')){
            do {
                System.out.println("Incorrect input. Please only enter 'X' or 'O'.");
                System.out.println("capital X or capital O");
                symbol = scanner.next().charAt(0);
            } while (!(symbol == 'X' || symbol == 'O'));
            System.out.println("Nice, you have chosen to be " + symbol + ". You will be making the first move. \n");
        }
        else{
            System.out.println("Nice, you have chosen to be " + symbol + ". You will be making the first move. \n");
        }

        for( char gamePiece: pos){
            if (gamePiece == 'X' || gamePiece =='O'){
                return true;
            }
        }

        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");

//       while(){
//
//        }

        do {
            turn = 1;
            if (turn % 2 != 0){
                move = symbol;
                turn ++;
            }else{
                char alt;
                if(symbol = 'X'){
                    alt = 'O';
                }
                move = alt;
            }

            System.out.println("Please refer to the board above and pick a number/position between 1 -9 and place your token");
            move = scanner.nextInt();




            if (move < 1 || move > 9) {
                System.out.println("Invalid input， please enter a number/position that is between 1-9");
                move = scanner.nextInt();
            }

            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");


        }while( pos = false );
        System.out.println("Dun Dun Dun, it is a Draw Game. Good luck next round.");

       /*for (int i = 0; i < pos.length; i++){

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
