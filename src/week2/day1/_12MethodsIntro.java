package week2.day1;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Alexander on 10.09.2016.
 */


public class _12MethodsIntro {
    public static void main(String[] args) {
       // ArrayUtils.createArray(100);
        ArrayUtils.printArray(ArrayUtils.createArray(10));

        int[] array = ArrayUtils.createRandomArray(15, 25, 50);
        ArrayUtils.printArray(array);
    }
}
