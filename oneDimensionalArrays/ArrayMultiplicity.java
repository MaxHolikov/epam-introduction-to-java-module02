package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class ArrayMultiplicity {

    public static void main(String[] args) {

        String arrayLength = "Enter the number of array elements: ";
        String divisorNumber = "Enter divisor: ";
        int n = enterFromConsol(arrayLength);
        int k = enterFromConsol(divisorNumber);
        int[] myArray = new int[n];

        createRandomArray(myArray);
        arrayPrint(myArray);
        System.out.print("Sum of array elements that are multiples of "+k +" : ");
        System.out.println(sumMultiplicityNum(myArray,k));

    }

//
    private static int enterFromConsol(String text) {
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        int positiveNumber;
        positiveNumber = 0;
        while (!isCorrect) {
            while (!sc.hasNextInt()) {
                String str = sc.next();
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println("Enter positive number: ");
                isCorrect = false;
            }
            if (sc.hasNextInt()) {
                positiveNumber = sc.nextInt();

                if (positiveNumber < 1) {
                    isCorrect = false;
                    System.out.println("Your number isn`t correct. Do it again");
                    System.out.println("Enter positive number: ");
                }

                if (positiveNumber >= 1) {
                    isCorrect = true;
                    break;
                }
            }
        }
        return positiveNumber;
    }
//
    private static void createRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    private static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
//
    private static int sumMultiplicityNum(int[] array, int divisor) {
        int sumMultiplNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                sumMultiplNum=sumMultiplNum+array[i];
            }
        }
        return sumMultiplNum;
    }


}