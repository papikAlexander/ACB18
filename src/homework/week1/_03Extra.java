package homework.week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _03Extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter = ");
        int number = sc.nextInt();
        int num = number;
        int num2;
        int n = 0;

        for (int i = 0; i <= 50; i++){
            num /= 10;
            n++;
            if(num == 0){
                break;
            }
        }
        int k=0;
        for(int i = n; i > 0; i--){
            num2 = number / ((int)Math.pow(10, i-1));
            number %= ((int)Math.pow(10, i-1));
            if (num2 == 8){
                k++;
            }
        }
        System.out.println(k);
    }
}
