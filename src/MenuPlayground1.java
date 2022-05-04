import java.util.Scanner;

public class MenuPlayground1 {

    static String [] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        do{
            displayGuests();
            displayMenu();
            int option = getOptions();

//            System.out.println("-------------------------------\n - Guests -\n");
//            for (int i= 0; i < guests.length; i++) {
//                System.out.println(guests[i] == null ? "--" : guests[i]);
//            }

//            System.out.println("-------------------------------\n - Menu -\n");
//            System.out.println();
////            System.out.println("1 - Display All Guests");
//            System.out.println("1 - Add Guest");
//            System.out.println("2 - Remove Guest");
//            System.out.println("3 - Exit");
//            System.out.print("option: ");
//            int option = scanner.nextInt();
//            System.out.println();
//            System.out.println();

//            System.out.print("option: ");
//            int option = scanner.nextInt();
//            System.out.println();
//            System.out.println();

//            if (option == 1 ){
//                System.out.println("-------------------------------\n - Guests -\n");
//
//                for (int i= 0; i < guests.length; i++){
////                    if(guests[i] == null){
////                        guests[i]= "--";
////                        System.out.println(guests[i]);
////                    }
////                    else{
////                        System.out.println(guests[i]);
////                    }
//                    System.out.println(guests[i] == null? "--": guests[i]);
//
//                }
//            }
             if (option == 1) {
                for(int i=0; i< guests.length; i++){
                    if(guests[i] == null){
                        System.out.println("Please Enter Name of the guest to be added:");
                        guests[i] = scanner.next();
                        break;
                    }
                }

            } else if (option== 2) {
                System.out.println("Which guest would you like to remove from the list? ");
                String name = scanner.next();
                for (int i =0; i < guests.length; i++){
                    if(guests[i] != null&& guests[i].equals(name)) {
                        guests[i] = null;
                        System.out.println(name + " has been removed from the list.");
                        break;
                    }
                }

            } else if (option == 3) {
                break;
            }
        }while(true);

        System.out.println("");
        System.out.println("Exited");
    }

     static void displayGuests(){
         System.out.println("-------------------------------\n - Guests -\n");
         for (int i= 0; i < guests.length; i++) {
             System.out.println(guests[i] == null ? "--" : guests[i]);
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

}

