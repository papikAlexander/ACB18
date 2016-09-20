package lottery;

import java.util.Scanner;

/**
 * Created by Alexander on 18.09.2016.
 */
public class LotteryUtils {
    public static int[] generateLotteryNumbers(int size, int min, int max) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            int random = generateRandomNumber(min, max);
            while(isPresentInArray(array, random)){
                random = generateRandomNumber(min, max);
            }
            array[i] = random;
        }
        return array;
    }

    private static boolean isPresentInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) return true;
        }
        return false;
    }

    private static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() *(max - min + 1));
    }

    public static int[] enterNumber(int size, int min, int max) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[size];
        System.out.printf("Enter number %d till %d:\n", min, max);
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int enteredNumber = sc.nextInt();
                if (enteredNumber > max || enteredNumber < min) {
                    System.out.printf("Number must be in range from %d till %d!\n", min, max);
                } else if (isPresentInArray(array, enteredNumber)) {
                    System.out.println("Number has already been entered\n");
                } else {
                    array[i] = enteredNumber;
                    break;
                }
            }
        }
        return array;
    }

    public static int countSameNumber(int[] lotteryNumber, int[] userNumbers) {
        if(lotteryNumber == null || userNumbers == null || lotteryNumber.length != userNumbers.length) return  -1;
        int counter = 0;
        for (int i = 0; i < lotteryNumber.length; i++) {
            for (int j = 0; j < userNumbers.length; j++) {
                if(lotteryNumber[i] == userNumbers[j])
                    counter++;
            }
        }
        return counter;
    }

    public static String generateGreeting(int count) {
        String greeting;

        switch (count){
            case 6:
                greeting = String.format("You guess all %d numbers!!! Jackpot!!!", count);
                break;
            case 5:
                greeting = String.format("You guess all %d numbers!!! Almost!!!", count);
                break;
            case 4:
                greeting = String.format("You guess all %d numbers!!! Very good!!!", count);
                break;
            case 3:
                greeting = String.format("You guess all %d numbers!!!", count);
                break;
            default:
                greeting = String.format("You guess all %d numbers!!! Lose!!!", count);
                break;
        }
        return greeting;
    }
}
