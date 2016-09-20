package lottery;

import utils.ArrayUtils;

/**
 * Created by Alexander on 18.09.2016.
 */

/* "Лотерея"

         Програма генерирует шесть случайных, целых чисел в диапазоне от 1 до 42 (включительно).

         Числа не должны совпадать!!! (сделать отдельным методом в классе ArrayUtils)

         Пользователь вводит 6 разных чисел в диапазоне от 1 до 42 (включительно). (сделать отдельным методом)

         Программа вывод в консоль выпавшые номера в порядке возрастания

         (использовать один из методов в Вашем классе ArrayUtils).

         И показывает количество угаданных пользователем чисел. (сделать отдельным методом)

         Придумать варианты поздравлений на случаи совпадений (3 из 6, 4 из 6, 5 из 6, 6 из 6, прочие).
*/
public class Lottery {
    public static void main(String[] args) {

        int[] lotteryNumber = LotteryUtils.generateLotteryNumbers(6, 1, 42);
        int[] userNumbers = LotteryUtils.enterNumber(6, 1, 42);
        ArrayUtils.bubbleSort(lotteryNumber);
        ArrayUtils.bubbleSort(userNumbers);
        int count = LotteryUtils.countSameNumber(lotteryNumber, userNumbers);
        String greating = LotteryUtils.generateGreeting(count);
        ArrayUtils.printArray(lotteryNumber);
        ArrayUtils.printArray(userNumbers);
        System.out.println(greating);


    }
}
