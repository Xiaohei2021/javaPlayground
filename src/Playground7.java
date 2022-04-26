public class Playground7 {
    public static void main (String[] args){

        int[] numbs = {15,29,36,41,53, 90, 57, 20, 35, 41};
//        System.out.println(numbs[3]);
//
//        numbs[3]=43;
//        System.out.println(numbs[3]);

//        for(int i = 0 ; i< a.length; i++){
//            System.out.println(numbs[i]);
//        }

//        for(int i = 9; i>= 0; i--){
//            System.out.println(numbs[i]);
//        }

        for(int i = numbs.length - 1; i >= 0; i--) {
            System.out.println(numbs[i]);
        }
    }

}
