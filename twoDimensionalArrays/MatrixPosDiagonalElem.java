package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

//Найти положительные элементы главной диагонали квадратной матрицы

public class MatrixPosDiagonalElem {
    public static final double randomInterval = 20;

    public static void main(String[] args) {

        int[][] myArray = new int[5][5];
        createRandomArray(myArray);
        arrayPrint(myArray);
        System.out.println("==============");

        arrayPrintDiagonal(myArray);
        System.out.println("==============");
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
    private static void arrayPrintDiagonal(int[][] array) {
        System.out.print("Positive elements of diagonal line: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] > 0) {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
        System.out.println();
    }


}