public class Season {

    public static void main(String[] args) {
        whichSeason(Month.AUGUST);
        whichSeason(Month.MAY);
        whichSeason(Month.DECEMBER);

    }

//    public static void whichSeason(Month month){
//        switch (month){
//            case JANUARY:
//                System.out.printf("%s is in the winter season.\n", month);
//                break;
//    }

    public static void whichSeason(Month month){

        switch (month){
//            case JANUARY:
//            System.out.printf("%s is in the winter season.\n", month);
//            break;
            case DECEMBER, JANUARY,FEBRUARY:
                System.out.printf("%s is in the winter season.\n", month);
                break;

            case MARCH, APRIL,MAY :
                System.out.printf("%s is in the spring season.\n", month);
                break;
//            case APRIL:
//                System.out.printf("%s is in the spring season.\n", month);
//                break;
//            case MAY:
//                System.out.printf("%s is in the spring season.\n", month);
//                break;
            case JUNE:
                System.out.printf("%s is in the summer season.\n", month);
                break;
            case JULY:
                System.out.printf("%s is in the summer season.\n", month);
                break;
            case AUGUST:
                System.out.printf("%s is in the summer season.\n", month);
                break;
            case SEPTEMBER:
                System.out.printf("%s is in the fall season.\n", month);
                break;
            case OCTOBER:
                System.out.printf("%s is in the fall season.\n", month);
                break;
            case NOVEMBER:
                System.out.printf("%s is in the fall season.\n", month);
                break;


        }



    }
}
