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
        System.out.println("3 - Exit");
    }

    static int getOptions(){
        System.out.print("option: ");
        int option = scanner.nextInt();
        System.out.println();
        System.out.println();
        return option;
    }

    static void addGuest(){
        for(int i=0; i< guests.length; i++){
            if(guests[i] == null){
                System.out.println("Please Enter Name of the guest to be added:");
                guests[i] = scanner.next();
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

