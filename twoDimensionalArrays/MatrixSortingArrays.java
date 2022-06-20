package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

public class MatrixSortingArrays {

    public static final double randomInterval = 15;

    public static void main(String[] args) {

        int[][] myArray = new int[5][5];
        int[][] copyArray = new int[myArray.length][myArray.length];
        createArray(myArray);

        copyArray(myArray, copyArray);
        arrayPrint(copyArray);

      //  sortLineAscending(copyArray);
      //  sortLineDescending(copyArray);
      //  sortColumnAscending(copyArray);
        sortColumnDescending(copyArray);
    }


    private static void createArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (randomInterval + 1));      //array[i][j] = (int) (Math.random() * (2 * randomInterval + 1)) - (int) randomInterval;
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
        System.out.println("==========================================");
    }

    //
    private static void copyArray(int[][] array, int[][] copyArray) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                copyArray[i][j] = array[i][j];
            }
        }
    }

    //Sort matrix rows in ascending order
    private static void sortLineAscending(int[][] array) {
        //SortBubble
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - 1; j++)
                    if (array[i][j] > array[i][j + 1]) {
                        isSorted = false;
                        buffer = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = buffer;
                    }
            }
        }
        arrayPrint(array);
    }

    // Sort matrix rows in descending order
    private static void sortLineDescending(int[][] array) {

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - 1; j++)
                    if (array[i][j] < array[i][j + 1]) {
                        isSorted = false;
                        buffer = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = buffer;
                    }
            }
        }
        arrayPrint(array);
    }

//   Sort matrix columns in ascending order
    private static void sortColumnAscending(int[][] array) {

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array[0].length-1; i++) {
                for (int j = 0; j < array[i].length; j++)
                    if (array[i][j] > array[i+1][j]) {
                        isSorted = false;
                        buffer = array[i][j];
                        array[i][j] = array[i+1][j];
                        array[i+1][j] = buffer;
                    }
            }
        }
        arrayPrint(array);
    }

    // Sort matrix columns in descending order
    private static void sortColumnDescending(int[][] array) {

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array[0].length-1; i++) {
                for (int j = 0; j < array[i].length; j++)
                    if (array[i][j] < array[i+1][j]) {
                        isSorted = false;
                        buffer = array[i][j];
                        array[i][j] = array[i+1][j];
                        array[i+1][j] = buffer;
                    }
            }
        }
        arrayPrint(array);
    }

}