import java.util.Scanner;

public class MenuPlayground1 {

    public static void main(String[] args){
        String [] guests = new String[10];

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit");
            System.out.print("option: ");
            System.out.println();


            int option = scanner.nextInt();

            if (option == 1 ){
                for (int i= 0; i < guests.length; i++){
                    System.out.println(guests[i]);
                }
            } else if (option == 2) {
                for(int i=0; i< guests.length; i++){
                    if(guests[i] == null){
                        System.out.println("Please Enter Name of the guest to be added:");
                        guests[i] = scanner.next();
                        break;
                    }
                }

            } else if (option== 3) {
                System.out.println("Which guest would you like to remove from the list? ");
                String name = scanner.next();
                for (int i =0; i < guests.length; i++){
                    if(guests[i] != null&& guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }

            } else if (option == 4) {
                break;
            }
        }while(true);

        System.out.println("");
        System.out.println("Exited");

    }

}

