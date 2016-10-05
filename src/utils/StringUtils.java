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
                char[] word = array[i].toCharArray();
                    for (int j = 0; j < word.length/2; j++) {
                        char tmp = word[j];
                        word[j] = word[word.length - j - 1];
                        word[word.length - j - 1] = tmp;
                    }
                    array[i] = "";
                for (int j = 0; j < word.length; j++) {
                    array[i] += word[j];
                }
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

//3.3. Написать метод, который проверяет является ли строка палиндромом
    public static void palindrome(String sentence){
        String first = sentence.substring(0, sentence.length()/2).toLowerCase();
        StringBuffer last = new StringBuffer();
        if (sentence.length() % 2 == 0)
            last.append(sentence.substring(sentence.length()/2, sentence.length()).toLowerCase());
        else
            last.append(sentence.substring(sentence.length()/2 + 1, sentence.length()).toLowerCase());
        last.reverse();

        if(first.contentEquals(last.toString())){
            System.out.println("It's polindrome");
        } else {
            System.out.println("It isn't polindrome");
        }
        System.out.println(first);
        System.out.println(last);
    }

/*    3.6. Нули
    Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
    Вход:
            10001101001
    Выход:
            (2,4) - цепочка нулей
            (5,6) - цепочка единиц*/

public static void chain(long number){
    String array = "" + number;
    StringBuffer arr = new StringBuffer();
    StringBuffer arr2 = new StringBuffer();

    for (int i = 0; i < array.length(); i++) {
        arr.append('0');
        arr2.append('1');
    }
    for (int i = 0; i < array.length(); i++) {
        int tmp = array.indexOf(arr.toString());
        if (tmp != -1){
            System.out.printf("(%d,%d) - цепочка нулей", tmp + 1, arr.length() + tmp);
            System.out.println();
            break;
        } else {
            arr.deleteCharAt(0);
        }
    }
    for (int i = 0; i < array.length(); i++) {
        int tmp2 = array.indexOf(arr2.toString());
        if (tmp2 != -1){
            System.out.printf("(%d,%d) - цепочка единиц", tmp2 + 1, arr2.length() + tmp2);
            break;
        } else {
            arr2.deleteCharAt(0);
        }

    }
}
}
