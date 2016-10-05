package utils;

/**
 * Created by Alexander on 17.09.2016.
 */
public class MatrixUtils {

    public static int[][] createRandomMatrix(int row, int column, int accuracy){
        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*accuracy);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%2d] ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(boolean[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%5b] ", matrix[i][j]);
            }
            System.out.println();
        }
    }
//    3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

    public static int[][] replaceMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 5 == 0){
                    matrix[i][j] = 8;
                }
            }
        }
        return matrix;
    }

//    3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.

    public static boolean[][] createLogicMatrix(int row, int column){
        boolean[][] matrix = new boolean[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    matrix[i][j] = true;
                } else {
                    matrix[i][j] = false;
                }
            }
        }
        return matrix;
    }

//    	3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
//           b) Поменять наибольший и наименьший столбик в двухмерном массиве.

    public static int[][] swapTaskA(int[][] matrix){
        int maxIndex = 0;
        int max = 0;
        int min = 10000;
        int minIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int tmp = 0;
            for (int j = 0; j < matrix[i].length; j++) {
               tmp += matrix[i][j];
            }
            System.out.println(tmp);
            if (max < tmp){
                max = tmp;
                maxIndex = i;
            }
            if(min > tmp) {
                min = tmp;
                minIndex = i;
            }
        }
        swapRows(matrix, maxIndex, minIndex);
        System.out.printf("Max - %d, min - %d \n", maxIndex, minIndex);
        return matrix;
    }

    public static void swapRows(int[][] matrix, int maxIndex, int minIndex) {
        for (int j = 0; j < matrix[maxIndex].length; j++) {
            int tmp = matrix[maxIndex][j];
            matrix[maxIndex][j] = matrix[minIndex][j];
            matrix[minIndex][j] = tmp;
        }
    }

    public static int[][] swapTaskB(int[][] matrix){
        int maxIndex = 0;
        int max = 0;
        int min = 10000;
        int minIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int tmp = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                tmp += matrix[j][i];
            }
            System.out.println(tmp);
            if (max < tmp) {
                max = tmp;
                maxIndex = i;
            }

            if (min > tmp) {
                min = tmp;
                minIndex = i;
            }
        }
        swapColumn(matrix, maxIndex, minIndex);
        System.out.printf("Max - %d, min - %d \n", maxIndex, minIndex);
        return matrix;
    }

    private static void swapColumn(int[][] matrix, int maxIndex, int minIndex) {
        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][maxIndex];
            matrix[i][maxIndex] = matrix[i][minIndex];
            matrix[i][minIndex] = tmp;
        }
    }
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        if(matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return resultMatrix;
        }else{
            System.out.println("Wrong size matrix's");
            return null;
        }
    }

}
