package week2.day2;

import utils.ArrayUtils;

/**
 * Created by Alexander on 11.09.2016.
 */
public class _06BubbleSort {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createRandomArray(10, 5, 25);
        ArrayUtils.printArray(array);
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);

        String[] words = {"Egg", "Zoo", "Apple2", "Monkey", "Apple"};
        System.out.println((ArrayUtils.bubbleSort(words)));
    }
}
