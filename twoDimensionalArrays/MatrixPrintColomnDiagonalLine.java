package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;


public class MatrixPrintColomnDiagonalLine {

    public static final double randomInterval = 15;

    public static void main(String[] args) {

        int[][] myArray = new int[5][5];
        int[][] randomArray = new int[10][20];
        createRandomArray(myArray);
        arrayPrint(myArray);
        System.out.println("==============");

        //Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        arrayPrintOddColum(myArray);
        System.out.println("==============");

        //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        arrayPrintDiagonal(myArray);
        System.out.println("==============");
        //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        int line = 4;
        int colonm = 3;
        arrayPrint(myArray);
        System.out.println("==============");
        arrayPrintLine(myArray, line);

        arrayPrintColomn(myArray, colonm);
        System.out.println("==============");

        //Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
        //которых число 5 встречается три и более раз

        createRandomArray(randomArray);
        arrayPrint(randomArray);
        System.out.println("==============");
        printNumberColumn(randomArray);
        System.out.println("==============");




    }

    private static void createRandomArray(int[][] array) {

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
    }

    //
    private static void arrayPrintOddColum(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (j % 2 != 0 && array[0][j] > array[array.length - 1][j]) {
                    System.out.print("\t" + array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    //
    private static void arrayPrintDiagonal(int[][] array) {
        System.out.print("Diagonal line: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    //
    private static void arrayPrintLine(int[][] array, int line) {
        System.out.print("Line number " + line + ":\t ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == line) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    //
    private static void arrayPrintColomn(int[][] array, int colomn) {
        System.out.print("Colomn number " + colomn + ": ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == colomn) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // if 5 repeats more than 3 times, then output line numbers
    private static void printNumberColumn(int[][] randomArray) {

        System.out.print("If 5 repeats more than 3 times, then output line numbers: ");
        int repeate = 0;
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                if (randomArray[i][j] == 5) {
                    repeate++;
                }
            }
            if (repeate == 3) {
                System.out.print(i + "  ");
            }
            repeate = 0;
        }
        System.out.println();
    }


}

