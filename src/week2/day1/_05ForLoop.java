package week2.day1;

/**
 * Created by Alexander on 10.09.2016.
 */
public class _05ForLoop {
    public static void main(String[] args){
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.println(array[i]);
        }

    }
}
