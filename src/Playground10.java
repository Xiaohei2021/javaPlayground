public class Playground10 {
    public static void main(String[] args){
        double[] array1 = new double[]{ 25.92, 1.34, -76.24, 833.11, 76.084};
        String[] planets = new String[]{"earth", "moon", "sun", "jupiter", "mercury", "mars" };

        /*for (int i = 0; i < array1.length; i++){
            double e = array1[i];
            System.out.println(e);
        }*/

        for (double e : array1){
            System.out.println(e);

        }

        for (String e : planets){
            System.out.println(e);
        }

    }
}
