package week2.day2;

import utils.ArrayUtils;

/**
 * Created by Alexander on 11.09.2016.
 */
public class _02Overloading {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createArray(10);
        ArrayUtils.printArray(nums);

        char[] sumbols = {'a', 'b', 'c'};
        ArrayUtils.printArray(sumbols);
        System.out.println(sumbols);
    }
}
