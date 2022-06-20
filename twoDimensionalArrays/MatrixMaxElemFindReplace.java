package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class MatrixMaxElemFindReplace {

    public static final double randomInterval = 20;

    public static void main(String[] args) {

        int[][] myArray = new int[7][7];
        createRandomArray(myArray);
        arrayPrint(myArray);
        System.out.println("=======================");

        replaceMaxElement(myArray);

    }

    //
    private static void createRandomArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (2 * randomInterval + 1)) - (int) randomInterval;
            }
        }
    }

    //
    private static void arrayPrint(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j] + "\t");
            }
            System.out.println();
        }
    }
//
    private static int findMaxElement(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static void replaceMaxElement(int[][] array) {
        int max = findMaxElement(array);
        System.out.println("Max element:" + max);
        System.out.println("Replace all odd elements on the " + max+" :");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
        arrayPrint(array);
    }

}