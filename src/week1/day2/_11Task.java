package week1.day2;

import java.util.Scanner;

/**
 * Created by Alexander on 04.09.2016.
 */
public class _11Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        boolean health;
        int salary;

        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your health:");
        health = sc.nextBoolean();
        System.out.println("Enter your salary:");
        salary = sc.nextInt();
        int ibizaPrice = 15_000;
        if(age >= 18 && age <= 60){

            if(salary > ibizaPrice && health){
                System.out.println("Go Ibiza");
            } else if(salary > ibizaPrice && !health) {
                System.out.println("Go BSP");
            } else{
                System.out.println("Go to granny");
            }
        } else if(age < 18){
            System.out.println("Go to granny");
        } else {
            if(health && salary > ibizaPrice){
                System.out.println("Go Ibiza");
            } else if(!health && salary > 20_000){
                System.out.println("Go Israel");
            } else if(health && salary < ibizaPrice){
                System.out.println("Go to granny");
            } else {
                System.out.println("BSP :'(");
            }
        }

    }
}
