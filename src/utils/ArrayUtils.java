package utils;

import java.util.Scanner;

/**
 * Created by Alexander on 10.09.2016.
 */
public class ArrayUtils {
    /*
    Print array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }

        System.out.println();
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
        System.out.println();
    }

    public static int[] createArray(int size) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }

        return array;
    }

    public static int[] createRandomArray(int size, int accuracy) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (+Math.random() * accuracy);
        }

        return array;
    }

    public static void bubbleSort(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public static String[] bubbleSort(String[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static String arrayToString(int[] array) {

        String arrayAsString = "[";

        for (int i = 0; i < array.length - 1; i++) {
            arrayAsString += array[i] + ", ";
        }
        arrayAsString += array[array.length - 1];
        return arrayAsString + "]";
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void swap(String[] array, int i, int j) {
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void _4_1HomeWork() {
        System.out.println("Task 4.1");
        int[] array = createRandomArray(10, 100);
        ArrayUtils.printArray(array);

        int min = minArray(array);
        int max = maxArray(array);
        System.out.println("Min = " + min + "\nMax = " + max);
        System.out.println();
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static int averageArray(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    public static void _4_2HomeWork() {
        System.out.println("Task 4.2");
        int[] array = createRandomArray(10, 100);
        printArray(array);

        int average = averageArray(array);
        System.out.println("Average = " + average);
        System.out.println();
    }

    public static void _4_3Homework() {
        System.out.println("Task 4.3");
        int[] array = createRandomArray(10, 100);
        printArray(array);
        int tmp = 0;
        int max = array[0];
        int positionMax = 0;
        int positionMin = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                positionMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                positionMin = i;
            }
        }
        tmp = array[positionMin];
        array[positionMin] = array[positionMax];
        array[positionMax] = tmp;

        printArray(array);
        System.out.println();
    }

    public static void _4_4Homework() {
        System.out.println("Task 4.4");
        int[] array = createRandomArray(10, 100);
        int[] array2 = createRandomArray(10, 100);

        System.out.println("Array 1");
        printArray(array);
        System.out.println("Array 2");
        printArray(array2);

//      Какой вариант правильный?

//      Копия массива
//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[i];
//        }

//      Копия ссылки
        array2 = array;

        System.out.println("Array 1");
        printArray(array);
        System.out.println("Array 2");
        printArray(array2);
        System.out.println();
    }
    public static void _4_5Homework() {
        System.out.println("Task 4.5");
        int[] array = createRandomArray(100, 10);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int number = sc.nextInt();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number)
                counter++;
        }
        printArray(array);
        System.out.println("Your number fit = " + counter);
        System.out.println();
    }
    public static void _4_6Homework() {
        System.out.println("Task 4.6");

        int[] array = createRandomArray(10, 100);
        int[] firstArray = new int[array.length/2];
        int[] secondArray = new int[array.length/2];
        printArray(array);

        for (int i = 0; i < array.length/2; i++) {
            firstArray[i] = array[i];
            secondArray[i] = array[array.length/2 + i];

        }

        if (averageArray(firstArray) > averageArray(secondArray)){
            printArray(firstArray);
        } else if (averageArray(firstArray) == averageArray(secondArray)){
            printArray(array);
        } else {
            printArray(secondArray);
        }
        System.out.println();
    }

    public static void _4_7Homework() {
        System.out.println("Task 4.7");
        int[] arr1 = createRandomArray(10, 10);
        int[] arr2 = createRandomArray(10, 10);

        printArray(arr1);
        printArray(arr2);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += arr2[i];
        }

        printArray(arr1);
        System.out.println();
    }

    public static void _4_8Homework() {
        System.out.println("Task 4.8");
        int[] array = new int[10];
        int tmp;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){

                do{
                    tmp = (int)(Math.random()*100);
                } while (tmp % 2 == 0);

                array[i] = tmp;
            } else {
                do{
                    tmp = (int)(Math.random()*100);
                } while (tmp % 2 != 0);

                array[i] = tmp;
            }
        }
        printArray(array);
        System.out.println();
    }

    public static void _4_9Homework() {
        System.out.println("Task 4.9");

        int[] array = createRandomArray(10, 25, 75);
        int[] array2 = createRandomArray(10, 25, 75);
        int counter = 0;
        int counter2 = 0;

        printArray(array);
        printArray(array2);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counter++;
            if (array2[i] % 2 == 0)
                counter2++;
        }

        if (counter > counter2){
            System.out.println("Array1 > Array2");
        } else if (counter == counter2){
            System.out.println("Array1 = Array2");
        } else {
            System.out.println("Array1 < Array2");
        }

        System.out.println();
    }

    public static void _4_10Homework() {
        System.out.println("Task 4.10");

        int[] array = createRandomArray(10, 10);
        int[] newArray = splitArray(array, 2, 6);

        printArray(array);
        printArray(newArray);
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        // обрезать массив по границам start и end
        int[] array = new int[end - start];

        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i + start];
        }
        return array;
    }
}
