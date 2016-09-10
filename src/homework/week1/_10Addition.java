package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _10Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the duration and day of the negotiations.\nOne hours = 200 UAN\nWeekend discount - 20%");
        System.out.print("Time = ");
        double time = sc.nextDouble();

        System.out.print("Day = ");
        int day = sc.nextInt();
        double price;

        if (day == 7 || day == 6) {
            price = time * 200 * 0.8;
        } else {
            price = time * 200;
        }

        System.out.println("Your price: " + price + " UAN");
    }
}
