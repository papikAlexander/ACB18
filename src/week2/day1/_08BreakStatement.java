package week2.day1;

import java.util.Scanner;

/**
 * Created by Alexander on 10.09.2016.
 */
public class _08BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 123456;

        while(true){
            System.out.println("Enter password");
            int enteredPass = sc.nextInt();
            if (enteredPass == pass)
                break;
        }

    }
}
