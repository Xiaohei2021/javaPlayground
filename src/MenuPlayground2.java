import java.util.Scanner;

public class MenuPlayground2 {

    static String [] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        insertTestNames();

        do{
            displayGuests();
            displayMenu();
            int option = getOptions();

            if (option == 1) {
               addGuest();
            }
            else if (option== 2) {
                removeGuest();
            }
            else if (option == 3) {
                editGuest();
            }
            else if (option == 4) {
                insertGuest();
            }
            else if (option == 5) {
                break;
            }
        }while(true);

        System.out.println("");
        System.out.println("Exited");
    }

    static void displayGuests(){
        System.out.println("-------------------------------\n - Guests -\n");
        boolean isEmpty = true;
        for (int i= 0; i < guests.length; i++) {
//             System.out.println(guests[i] == null ? i+1 + ". --" : i+1 + ". "+guests[i]);
            if (guests[i] != null){
                System.out.println( (i+1 )+". " +( guests[i]));
                isEmpty = false;
            }
        }
        if(isEmpty){
            System.out.println("Guest List is empty.");
        }
    }

    static void displayMenu(){
        System.out.println("-------------------------------\n - Menu -\n");
        System.out.println();
//            System.out.println("1 - Display All Guests");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Edit Guest");
        System.out.println("4 - Insert Guest");
        System.out.println("5 - Exit");
    }

    static int getOptions(){
        System.out.print("option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println();
        return option;
    }

    static void addGuest(){
        for(int i=0; i< guests.length; i++){
            if(guests[i] == null){
                System.out.println("Please Enter Name of the guest to be added:");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void removeGuest(){
        System.out.println("Which guest would you like to remove from the list? ");
//        String name = scanner.next();
        int guestNumb = scanner.nextInt();
        do{
            System.out.println("Error: There is no gues with that number");
        }while(guestNumb <= guests.length && guestNumb >= 1 && guests[guestNumb-1] != null);

        guests[guestNumb-1] = null;

        for (int i =0; i < guests.length; i++){
//            if(guests[i] != null && guests[i].equals(name)) {
//                guests[i] = null;
//                System.out.println(name + " has been removed from the list.");
//                break;
//            }
//            if(i+1 == guestNumb) {
//                guests[i] = null;
//                break;
//            }
        }

        String[] temp = new String[guests.length];
        int ti = 0;
        for(int i=0; i< guests.length; i++) {
            if (guests[i] != null){
                temp[ti] = guests[i];
                ti++;
            }
        }
        guests = temp;
    }

    static void editGuest(){
        System.out.println("Please enter the Guest number you wish to edit");
        int guestNumber = scanner.nextInt();
        scanner.nextLine();

        do{
            System.out.println("Error: There is no gues with that number");
        }while(guestNumber <= guests.length && guestNumber >= 1 && guests[guestNumber-1] != null);

        System.out.println("Please enter the new guest's name");
        String newGuest = scanner.nextLine();

        guests[guestNumber-1] = newGuest;

    }

    static void insertGuest(){
        System.out.println("Please enter the number you wish to insert the guest to");
        int guestNumber = scanner.nextInt();
        scanner.nextLine();

        if (guestNumber >= 1 && guestNumber <= guests.length && guests[guestNumber-1] != null) {
            System.out.println("Please enter the new guest's name");
            String newGuest = scanner.nextLine();

            for(int i = guests.length -1; i > guestNumber-1; i--){
                guests[i] = guests[i-1];
            }
            guests[guestNumber-1] = newGuest;

        }else{
            System.out.println("\nError: There is no guest with that number.");
        }


    }


    static void insertTestNames(){
        guests[0]="Jackie";
        guests[1]="Fred";
        guests[2]="Alice";
        guests[3]="Sarah";
        guests[4]="Dexter";
        guests[5]="Bob";
        guests[6]="Thomas";
        guests[7]="Jake";
        guests[8]="Sam";
    }

}

