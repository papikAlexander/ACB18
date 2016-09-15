package homework.week2;

import java.util.Scanner;

/**
 * Created by Alexander on 13.09.2016.
 */
public class GuessTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = (int)(25 + Math.random() * (125 - 25));
       // System.out.println(number);
        System.out.println("Enter number 25..125");

        int enter = sc.nextInt();

        for (int i = 5; i > 0; i--) {
            if (enter == number){
                if (i == 5) {
                    System.out.println("Guess! You rock!");
                    break;
                } else if (i == 4){
                    System.out.println("Guess! You monster!");
                    break;
                } else if (i == 3){
                    System.out.println("Guess! Just spent three attempts!");
                    break;
                } else if (i == 2){
                    System.out.println("Guess! Congratulations!");
                    break;
                } else if (i == 1) {
                    System.out.println("Guess! You almost lost! ");
                    break;
                }
            } else if (enter > number){
                System.out.println("Your number a little more than");
                System.out.println();
            } else {
                System.out.println("Your number a little more less");
                System.out.println();
            }
            if (i == 1) {
                System.out.println("You lose! That number " + number + "\nTry again");
                break;
            }
            System.out.println("Remaining " + (i-1) + " attempts");
            enter = sc.nextInt();
        }

    }
}
