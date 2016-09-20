package week3.day2;



/**
 * Created by Alexander on 18.09.2016.
 */
public class _03Recursion {
    public static void main(String[] args) {
//        f(10);
        factorial(5);
        System.out.println(factorial(5));
    }

//    private static void factorial(int i){
//        int factorial = 1;
//        for (int j = 0; j < i; j++) {
//            factorial *= j;
//        }
//        System.out.println(factorial);
//    }
    private static int factorial(int i){

        if(i <= 1) return 1;
        return i * factorial(i - 1);
    }
//    private static void f(int i) {
//        if(i < 1)
//            return;
//        System.out.println(i);
//        f(i - 1);
//        System.out.println(i);
//    }
}
