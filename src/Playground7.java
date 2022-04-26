public class Playground7 {
    public static void main (String[] args){

        int[] numbs = {15,29,368,41,53, 906, 570, 20, 35, 41};
//        System.out.println(numbs[3]);
//
//        numbs[3]=43;
//        System.out.println(numbs[3]);
        int count = 0;
        double sum = 0;

        for(int i = 0 ; i< numbs.length; i++){
            /*if (numbs[i] > 100){
                System.out.println(numbs[i]);
                System.out.println("array indexes = " + i);
                System.out.println("array indexes = " + count);
            }*/

            /*if (numbs[i] > 100){
                count++;
                System.out.println("The number " + numbs[i] + " is greate than 10, at array index of #" + i);
            }*/

            if (numbs[i] > 100){
                count++;
            }
            sum = sum + numbs[i];
        }
        System.out.println("There are " + count + " numbers that is greater than 100.");
        System.out.println("The sum all of the numbers in the array is " + sum);
        System.out.println("The mean of the numbers in the array is " + sum/numbs.length );



        /*for(int i = 9; i>= 0; i--){
            System.out.println(numbs[i]);
        }

        for(int i = numbs.length - 1; i >= 0; i--) {
            System.out.println(numbs[i]);
        }*/
    }

}
