package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _05Extra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A:");
        int a = sc.nextInt();
        int fibonacci = 0;
        int res = 0;
        int res2 = 1;
        for (int i = 0; i <= 100; i++){
            fibonacci = res + res2;
            res = res2;
            res2 = fibonacci;
            if (a == fibonacci || a < fibonacci){
                if (a == fibonacci){
                    System.out.println("фn = A; n = " + (i+2));
                }else{
                    System.out.println("фn != A; n = -1");
                }
                break;

            }
        }
    }
}
