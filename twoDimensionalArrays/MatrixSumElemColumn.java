package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class MatrixSumElemColumn {

    public static final double randomInterval = 10;

    public static void main(String[] args) {

        int n = 6;
        int[][] myArray = new int[n][n];

        createRandomArray(myArray);
        arrayPrint(myArray);
        sumElemColumn(myArray, n);
    }

    //
    private static void createRandomArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (2 * randomInterval + 1));
            }
        }
    }

    //
    private static void arrayPrint(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=====================");
    }

    //
    private static void sumElemColumn(int[][] array, int lengthArray) {
        int sum = 0;
        int maxSumElemColumn = 0;
        int numberColumn = 0;
        int[] sumArray = new int[lengthArray];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i][j];
            }
            sumArray[j] = sum;
            sum=0;
        }
        maxSumElemColumn = sumArray[0];
        System.out.println("Sum of elements in columns: ");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + "\t");
            if (maxSumElemColumn < sumArray[i]) {
                maxSumElemColumn = sumArray[i];
                numberColumn = i;
            }
        }
        System.out.println();
        System.out.println("Maximum sum of elements in column number " + numberColumn + ": " + maxSumElemColumn);
    }

}
