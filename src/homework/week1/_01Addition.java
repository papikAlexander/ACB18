package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 04.09.2016.
 */
public class _01Addition {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter side a:");
        a = sc.nextInt();
        System.out.println("Enter side b:");
        b = sc.nextInt();
        System.out.println("Enter side c:");
        c = sc.nextInt();

        if((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
