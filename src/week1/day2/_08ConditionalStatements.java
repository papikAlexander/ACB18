package week1.day2;

import java.util.Scanner;

/**
 * Created by Alexander on 04.09.2016.
 */
public class _08ConditionalStatements {
    public static void main(String[] args){
        String login = "admin";
        int pass = 123;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Login:");
        String enteredLogin = sc.next();

        System.out.print("Enter your password:");
        int enteredPass = sc.nextInt();

        if(enteredLogin.equals(login) && enteredPass == pass){
            System.out.println("Hello in system ;)");
        }else{
            System.out.println("Wrong data :`(");
        }


    }
}
