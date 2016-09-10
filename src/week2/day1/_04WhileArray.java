package week2.day1;

/**
 * Created by Alexander on 10.09.2016.
 */
public class _04WhileArray {
    public static void main(String[] args) {
        int[] array = new int[100];

        int number = 0;
        while (number < 100){
            array[number] = number;

            System.out.println(array[number]);
            number++;
        }
    }
}
