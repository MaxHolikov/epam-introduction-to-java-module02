package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

import java.util.Scanner;


//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
public class MatrixColumnReplacement {

    public static final double randomInterval = 10;

    public static void main(String[] args) {

        int n = 4;
        int[][] myArray = new int[n][n];
        int columnReplayOne;
        int columnReplayTwo;
        createRandomArray(myArray);

        columnReplayOne = enterFromConsol(n);
        columnReplayTwo = enterFromConsol(n);

        arrayPrint(myArray);
        ColumnReplace(myArray,columnReplayOne,columnReplayTwo);

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
        System.out.println("=====================");
    }

    //
    private static int enterFromConsol(int line) {
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than the length of the array (<= " + (line-1) + "): ");
        int positiveNumber;
        positiveNumber = 0;

        while (!isCorrect) {
            while (!sc.hasNextInt()) {
                String str = sc.next();
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println("Enter a number less than the length of the array (<= " + (line-1) + "): ");
                isCorrect = false;
            }
            if (sc.hasNextInt()) {
                positiveNumber = sc.nextInt();

                if (positiveNumber > line-1) {
                    isCorrect = false;
                    System.out.println("Your number isn`t correct. Do it again");
                    System.out.println("Enter a number less than the length of the array (<= " + (line-1) + "): ");
                }
                if (positiveNumber <= line) {
                    isCorrect = true;
                    System.out.println(positiveNumber);
                    break;
                }
            }
        }
        return positiveNumber;

    }

    //
    private static void ColumnReplace(int[][] array, int columnReplaceOne, int columnReplaceTwo) {
        int bufer=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j==columnReplaceOne){
                    bufer=array[i][j];
                    array[i][j]=array[i][columnReplaceTwo];
                    array[i][columnReplaceTwo]=bufer;
                }
            }
        }
        arrayPrint(array);
    }

}