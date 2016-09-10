package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _02Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.print("Enter c = ");
        int c = sc.nextInt();

        if (a > 0){
            a = a * a * a;
        } else {
            a = 0;
        }

        if (b > 0){
            b = b * b * b;
        } else {
            b = 0;
        }

        if (c > 0){
            c = c * c * c;
        } else {
            c = 0;
        }

        System.out.println("a = " + a + ";\nb = " + b + ";\nc = " + c + ";");
    }
}
