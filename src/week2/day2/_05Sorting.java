package week2.day2;

import utils.ArrayUtils;

/**
 * Created by Alexander on 11.09.2016.
 */
public class _05Sorting {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 4, 5};

        int tmp;
        tmp = numbers[2];
        numbers[2] = numbers[3];
        numbers[3] = tmp;

        ArrayUtils.printArray(numbers);
    }
}
