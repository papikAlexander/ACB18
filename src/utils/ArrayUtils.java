package utils;

/**
 * Created by Alexander on 10.09.2016.
 */
public class ArrayUtils {
    /*
    Print array
     */
    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
        System.out.println();
    }

    public static int[] createArray (int size){
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createRandomArray (int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(min + Math.random() * (max - min));
        }

        return array;
    }
}
