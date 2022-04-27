import java.util.Arrays;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        int[] array1 = new int[20];
//        int[] array2 = new int[]{20,12,16,88,92,57,60,327,9,52};

        /*for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        for(int e : array2){
            System.out.println(e);
        }  */

       /* for (int i = 0; i < array1.length; i++ ){
            array1[i] =i +1 ;
            System.out.println(array1[i]);
        }
        System.out.println(Arrays.toString(array1));

        for (int i = array1.length -1; i > 0; i--){
            System.out.println(array1[i]);
        }*/

        /*double[] array3 = new double[]{12.56, 63.78, 55.12, 67.89, 24.36};
        double sum = 0 ;

        for(int i= 0; i < array3.length; i++){
            sum = sum + array3[i];
        }
        System.out.println(sum);
        System.out.println(sum/5);
         */

        Scanner scanner = new Scanner(System.in);
        String[] answer = new String[5];
        for(int i = 0; i < 5; i++){
            if(i<3){
                System.out.println("Please enter your top 5 favorite food");
                answer[i] = scanner.nextLine();
            }
            else{
                System.out.println("No more memory available.");
            }

        }
//        System.out.println(Arrays.toString(answer));
    }


}
