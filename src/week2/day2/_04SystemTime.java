package week2.day2;

import utils.ArrayUtils;

/**
 * Created by Alexander on 11.09.2016.
 */
public class _04SystemTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] array = ArrayUtils.createArray(100_000_000);
        long finish = System.currentTimeMillis();

        System.out.println("Process of creating take - " + (finish - start));
    }
}
