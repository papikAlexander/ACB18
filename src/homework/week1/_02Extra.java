package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _02Extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  = ");
        int a = sc.nextInt();
        long res = 1;

        for (int i = a; i > 1; i--){
            res *= i;
        }
        System.out.println("!" + a + " = " + res);

    }
}
