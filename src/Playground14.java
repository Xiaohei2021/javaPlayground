public class Playground14 {
    public static void main (String[] args){
        /*System.out.println(add(13,6));
        System.out.println(add(279,163));
        System.out.println(add(13,6) * add(4, 6));
        System.out.println(add(add(13,6), add(4, 6)));
        */
//        System.out.println(coneVolume(4,5));



//    public static int add(int a, int b){
//        return a+b;
//    }

//    public static double coneVolume(double r, double h){
//        return Math.PI * r * r * h/3;

    int a = 10;
    int b = a ;

    int [] x = {3, 22, 4, 16, 8};
    int [] y = x;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    for (int i = 0; i< x.length; i++){
        System.out.println("x[" + i + "] = " + x[i]);
    }

    for (int i = 0; i < y.length; i++){
        System.out.println("y[" + i + "] = " + y[i]);
    }

    }
}
