import java.util.Scanner;

public class Tictactoe3 {
    public static void main (String[] args){
        char[] pos = {' ',  ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char token;
        int gridPos;
        int turn =1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, lets play a fun tic tac toe game! Please pick a token, you can choose between X or O.");
        token = scanner.next().charAt(0);

       while(!(token == 'X')||(token == 'y')){
           System.out.println("Invalid entry, Please only pick between X or O.");
           token = scanner.next().charAt(0);
       }

        System.out.println("Perfect, you have chosen the " + token + " Token.");
        System.out.println("You will be making the first move, please refer to the board below and place your token\n ");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();
        gridPos = scanner.nextInt();

        while(gridPos <1 || gridPos >10){
            System.out.println("Invalid grid position, please refer to the above grid and ente a position between 1-9");
            gridPos = scanner.nextInt();
        }

        if(pos[gridPos-1] =='X'|| pos[gridPos-1]=='O'){
            System.out.println("This grid position is already taken, please pick another");
            gridPos = scanner.nextInt();
        }

        pos[gridPos-1]=token;
        turn ++;

        while(turn < 10){



            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");

            if(token == 'X'){
                token = 'O';
            } else if (token =='O') {
                token = 'X';
            }

        }
        System.out.println("It seems that the game has come to an impass, so it is a Draw Game. Good luck next round.");
    }
}
