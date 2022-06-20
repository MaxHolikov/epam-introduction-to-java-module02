package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class ArraySumPrimePosNumbers {

    public static void main(String[] args) {
        int n;
        String arrayLength = "Enter the number of array elements: ";
        n= enterFromConsol(arrayLength);
        double[] myArray = new double[n];

        createRandomArray(myArray);
        arrayPrint(myArray);
        sumPrimePosNum(myArray);
    }

    //
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
    private static void createRandomArray(double[] array) {
        double scale;
        for (int i = 0; i < array.length; i++) {
            scale = Math.pow(10, 3);
            array[i] = Math.ceil((Math.random() * 201 - 100) * scale) / scale;
        }
    }

    //
    private static void arrayPrint(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //
    private static void sumPrimePosNum(double[] array) {
        double sumPrimePosNum = 0;
        double scale = Math.pow(10, 2);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumPrimePosNum = sumPrimePosNum + array[i];
            }
        }
        sumPrimePosNum=Math.ceil(sumPrimePosNum*scale)/scale;
        System.out.println("Sum of array elements whose serial numbers are prime numbers: "+ sumPrimePosNum);
    }
}
