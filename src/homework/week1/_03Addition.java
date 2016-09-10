package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _03Addition {
    public static void main(String[] args){

        int number = 222;
        int residue = number % 100;
        int piece1 = number / 100;
        int piece2 = residue / 10;
        int piece3 = number % 10;

        if (piece1 == piece2 && piece1 == piece3){
            System.out.println("Numbers the same");
        } else {
            if (piece1 == piece2 || piece1 == piece3 || piece2 == piece3){
                System.out.println("Two numbers the same");
            } else{
                System.out.println("Numbers not same");
            }
        }
    }
}
