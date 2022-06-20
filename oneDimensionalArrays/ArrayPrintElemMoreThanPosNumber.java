package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class ArrayPrintElemMoreThanPosNumber {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        createRandomArray(myArray);
        arrayPrint(myArray);
        printCorrectPositionNumber(myArray);
    }

    //
    private static void createRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100; //[-100;100]
        }
    }

    //
    private static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //
    private static void printCorrectPositionNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }

    }
}



