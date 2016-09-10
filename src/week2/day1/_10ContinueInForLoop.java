package week2.day1;

/**
 * Created by Alexander on 10.09.2016.
 */
public class _10ContinueInForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 15;  i++){
            if(i == 6 || i == 13)
                continue;
            System.out.println(i);
        }
    }
}
