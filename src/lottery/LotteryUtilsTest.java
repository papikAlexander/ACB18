package lottery;

/**
 * Created by Alexander on 18.09.2016.
 */
public class LotteryUtilsTest {
    public static void test_lottery_number_generation(){
        int[] expected = LotteryUtils.generateLotteryNumbers(6, 1, 42);
        boolean result = false;

        if(expected != null && expected.length == 6){
           out: for (int i = 0; i < expected.length; i++) {
                    if (expected[i] < 1 || expected[i] > 42){
                        break;
                    }
                    for (int j = i + 1; j < expected.length; j++) {
                        if(expected[i] == expected[j]){
                            break out;
                    }
                }
            }
            result = true;
        }
        System.out.printf("test_lottery_number_generation - %s\n", result);
    }

    public static  void test_count_same_nambers(){
        int[] array1 = {1, 6, 13, 56, 111, 200};
        int[] array2 = {1, 7, 13, 83, 111, 89};
        int actual = LotteryUtils.countSameNumber(array1, array2);
        int expected = 3;
        System.out.printf("test_count_same_nambers \nexpected - %d, actual - %d, result - %b", expected, actual, expected == actual);
    }
}
