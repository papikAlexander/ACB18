package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _01Extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter des  = ");
        int des = sc.nextInt();
        int res;
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            res = des % 2;
            result += res * ((int)Math.pow(10, i));
            des /= 2;
            if (des == 0) {
                break;
            }
        }
        System.out.println("Result: " + result);

        System.out.print("Enter dvoich  = ");
        int dv = sc.nextInt();
        int result2 = 0;

        for (int i = 0; i <= 1000; i++) {
            res = dv % 10;
            dv /= 10;
            result2 += res *((int)Math.pow(2, i));
            if (dv == 0) {
                break;
            }
        }
        System.out.println("Result: " + result2);
    }
}
