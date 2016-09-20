package utils;

import java.util.Scanner;

/**
 * Created by Alexander on 20.09.2016.
 */
public class StringUtils {
    public static String enterString() {
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        return array;
    }

    public static void longWord(String array) {
        String[] array2 = array.split(" ");
        int max = array2[0].length();
        int index = 0;
        int counter = 0;
        for (int i = 1; i < array2.length; i++) {
            if (max == array2[i].length())
                counter++;
            if (max < array2[i].length()) {
                max = array2[i].length();
                index = i;
                counter = 0;
            }
        }
        System.out.printf("Long word - %s and %d other word, length - %d\n", array2[index], counter, max);
    }

    public static void shortWord(String text) {
        String[] array2 = text.split(" ");
        int min = array2[0].length();
        int index = 0;
        int counter = 0;
        for (int i = 1; i < array2.length; i++) {
            if (min == array2[i].length())
                counter++;
            if (min > array2[i].length()) {
                min = array2[i].length();
                index = i;
                counter = 0;
            }
        }
        System.out.printf("Short word - %s and %d other word, length - %d\n", array2[index], counter, min);
    }

    public static String replaceWord(String text, String wordReplace, String newWord) {
        String[] array = text.split(" ");
        StringBuffer array2 = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(wordReplace)){
                array[i] = newWord;
            }
            array2.append(array[i]).append(" ");
        }
        return array2.toString();
    }

    public static void uppercase(String text) {
        String[] array = text.split(" ");

        StringBuffer array3 = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            String arr = array[i].toUpperCase();
            char tmp = arr.charAt(0);
            array[i] = tmp + array[i].substring(1);
            array3.append(array[i]).append(" ");
        }
        System.out.println(array3);
    }

/*    Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
    Результат выводить на консоль.*/
    public static void path_1_4(String text) {
        String[] array = text.split(" ");
        StringBuffer array2 = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                StringBuffer arr = new StringBuffer();
                arr.append(array[i]);
                array[i] = arr.reverse().toString();
            } else {
                array[i] = delete(array[i]);
            }
            array2.append(array[i]).append(" ");
        }
        System.out.println(array2.toString());
    }

    private static String delete(String word) {
        char[] letters = word.toCharArray();
        StringBuffer words = new StringBuffer();
        for (int i = 0; i < letters.length; i++) {
            if(i % 2 != 0){
                words.append(letters[i]);
            }
        }
        return words.toString();

    }


}
