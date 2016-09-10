package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _08Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Price = ");
        double price = sc.nextDouble();

        if (price > 1000){
            System.out.println("Discount price = " + (price * 0.9));
        }else{
            System.out.println("No discounts. Price = " + price);
        }
    }
}
