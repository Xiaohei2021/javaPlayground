import java.util.Scanner;

public class TicTacToe2 {
    //There are two game pieces X or O
    // There should only be 9 moves
    // There will be a winner if 3 position are the same games pieces
    //The game is a draw if all 9 position are taken
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        char player;
        int move;
        int gameTurn =1;
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        System.out.println("Hey there, lets play a fun tic tac toe game!!");
        System.out.println("Which symbol would you like use, X or O?");
        player = scanner.next().charAt(0);
//        do {
//            System.out.println("Incorrect input. Please only enter 'X' or 'O'.");
//            System.out.println("capital X or capital O");
//            symbol = scanner.next().charAt(0);
//        } while (!(symbol == 'X' || symbol == 'O'));
//        System.out.println("Nice, you have chosen to be " + symbol + ". You will be making the first move. \n");

        if (!(player == 'X' || player == 'O')){
            do {
                System.out.println("Incorrect input. Please only enter 'X' or 'O'.");
                System.out.println("capital X or capital O");
                player = scanner.next().charAt(0);
            } while (!(player == 'X' || player == 'O'));
            System.out.println("Nice, you have chosen to be " + player + ". You will be making the first move. \n");
        }
        else{
            System.out.println("Nice, you have chosen to be " + player + ". You will be making the first move. \n");
        }


        if( (pos[0] == 'X' && pos[1] == 'X' && pos[2] == 'X' ||
                pos[3] == 'X' && pos[4] == 'X' && pos[5] == 'X' ||
                pos[6] == 'X' && pos[7] == 'X' && pos[8] == 'X' ||
                pos[0] == 'X' && pos[3] == 'X' && pos[6] == 'X' ||
                pos[1] == 'X' && pos[4] == 'X' && pos[7] == 'X' ||
                pos[2] == 'X' && pos[5] == 'X' && pos[8] == 'X' ||
                pos[0] == 'X' && pos[4] == 'X' && pos[8] == 'X' ||
                pos[2] == 'X' && pos[4] == 'X' && pos[6] == 'X'
        ) ||
                (pos[0] == 'O' && pos[1] == 'O' && pos[2] == 'O' ||
                        pos[3] == 'O' && pos[4] == 'O' && pos[5] == 'O' ||
                        pos[6] == 'O' && pos[7] == 'O' && pos[8] == 'O' ||
                        pos[0] == 'O' && pos[3] == 'O' && pos[6] == 'O' ||
                        pos[1] == 'O' && pos[4] == 'O' && pos[7] == 'O' ||
                        pos[2] == 'O' && pos[5] == 'O' && pos[8] == 'O' ||
                        pos[0] == 'O' && pos[4] == 'O' && pos[8] == 'O' ||
                        pos[2] == 'O' && pos[4] == 'O' && pos[6] == 'O')
        ) {
            return pos = "w";
        }

        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();

        for( char gamePiece: pos){
            if (!(gamePiece == 'X' || gamePiece =='O')){
                do {
                    System.out.println("Player " + player + ",Please refer to the board above and pick a position between 1 -9 to place your token");
                    move = scanner.nextInt();

                    if (move < 1 || move > 9) {
                        System.out.println("Invalid input, please enter a number/position that is between 1-9");
                        move = scanner.nextInt();
                    }
                    pos[move-1] = player;
                    System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
                    System.out.println("---+---+---");
                    System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
                    System.out.println("---+---+---");
                    System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");

                    if (player == 'X'){
                        player = 'O';
                    }else if(player == 'O'){
                        player='X';
                    }
                    gameTurn++;
                }while(gameTurn<10);




            }
        }
        System.out.println("Bummer, it is a Draw Game. Good luck next round.");



    }

}
