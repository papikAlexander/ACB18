package homework.week1;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _13Addition {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = -5;

        if (a + b + c > 0){
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = 0;
            b = 0;
            c = 0;
        }

        System.out.println("a = " + a + ";\nb = " + b + ";\nc = " + c + ";");
    }
}
