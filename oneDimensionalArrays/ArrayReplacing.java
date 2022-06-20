package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplacing {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        int[] arrayCopy = new int[10];
        createRandomArray(myArray);
        arrayPrint(myArray);
        int replaceNumber;

        String text = "Enter the number to replace: ";
        replaceNumber = enterFromConsol(text);
        System.out.println("If the elements of the array are less than " + replaceNumber + '\n' + "then they will be replaced by " + replaceNumber);

        replaceArray(arrayCopy, replaceNumber);  // or  arrayCopy = Arrays.copyOf(myArray,myArray.length);
        System.out.println("Default array: ");
        arrayPrint(myArray);
        System.out.println("Array after replacement: ");
        arrayPrint(arrayCopy);
    }

    //
    private static void createRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
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
    private static void arrayCopy(int[] array, int[] arrayCopy) {
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
    }
    //
    private static void replaceArray(int[] array, int replaceNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > replaceNumber) {
                array[i] = replaceNumber;
            }
        }
    }

    //
    private static int enterFromConsol(String text) {
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        int positiveNumber = 0;

        while (!isCorrect) {
            while (!sc.hasNextInt()) {
                String str = sc.next();
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println(text);
                isCorrect = false;
            }
            if (sc.hasNextInt()) {
                positiveNumber = sc.nextInt();
                isCorrect = true;
                break;
            } else {
                isCorrect = false;
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println(text);
            }
        }
        return positiveNumber;
    }

}