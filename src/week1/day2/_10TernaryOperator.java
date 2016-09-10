package week1.day2;

/**
 * Created by Alexander on 04.09.2016.
 */
public class _10TernaryOperator {
    public static void main(String[] args) {
        int age = 25;
        int adultLimit = 18;
        String answer;

        /*if(age > adultLimit){
            answer = "Adult";
        }else{

            answer = "Young";
        }

        System.out.println(answer);*/
        //                 true         fakse
        // condition ? statement1 : statement2
        answer = age > adultLimit ? "Adult" : "Young";
        System.out.println(answer);
    }
}
