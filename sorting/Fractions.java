package by.holikov.javaIntroduction.algorithmization.sorting;

//Даны дроби p1/q1, p2/q2, ... , pn/qn. (pi, qi - натуральные). Составить программу, которая приводит эти дроби
//к общему знаменателю и упорядочивает их в порядке возрастания.

import java.util.Arrays;

public class Fractions {
    public static void main(String[] args) {
        boolean isCorrect;
        int denominator;

        String[] strFraction = new String[]{"3/2", "2/3", "0/4", "7/8", "-8/64", "14/24"};

        int[] parsingArray = new int[2 * strFraction.length];
        int[] resultArray = new int[strFraction.length];

        System.out.println(Arrays.toString(strFraction));
        isCorrect = validArray(strFraction, parsingArray);

        if (isCorrect) {
            denominator = oneDenominator(parsingArray);

            if (denominator != 0) {
                fraction(parsingArray, denominator, resultArray);
            }
        }

    }

    private static boolean validArray(String[] array, int[] parsingArray) {
        int j = 0;
        int counter = 0;
        boolean isCorrect = true;

        for (int i = 0; i < array.length; i++) {
            String num = array[i];
            for (String returnVal : num.split("/")) {
                counter++;
                try {
                    int value = Integer.parseInt(returnVal);
                    parsingArray[j] = value;
                    j++;
                    if (counter == 2 && value == 0) {
                        System.err.println("Incorrect format! Fix element number " + i + ": " + array[i]);
                        parsingArray[j] = 0;
                        isCorrect = false;
                        counter = 0;
                    }
                    if (counter == 2) {
                        counter = 0;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Incorrect format! Fix element number " + i + ": " + array[i]);
                    parsingArray[j] = 0;
                    isCorrect = false;
                    if (counter == 2) {
                        counter = 0;
                    }
                }
            }

        }
        return isCorrect;
    }

    //

    private static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int maxNumber;
        int result = 0;

        if (firstNumber >= secondNumber) {
            maxNumber = firstNumber;
        } else {
            maxNumber = secondNumber;
        }

        if (firstNumber > 0 && secondNumber > 0) {
            for (int i = 1; i <= maxNumber; i++) {
                if (firstNumber % i == 0 && secondNumber % i == 0) {
                    result = i;
                }
            }
        } else {
            System.out.println("Enter correct numbers");
        }

        return result;
    }


    //
    private static int leastCommonMultiple(int firstNumber, int secondNumber) {
        int result=0;
        int greatestCommonDivisorNumber;

        if (Integer.MAX_VALUE / firstNumber >= secondNumber) {
            if (firstNumber > 0 && secondNumber > 0) {
                greatestCommonDivisorNumber = greatestCommonDivisor(firstNumber, secondNumber);

                result = (firstNumber / greatestCommonDivisorNumber) * secondNumber;

            } else {
                System.out.println("Enter correct numbers");
            }
        } else {
            System.out.println("Enter correct numbers. Result of multiply is too big!");
            result = 0;
        }

        return result;
    }


    //
    private static int oneDenominator(int[] array) {
        int counter = 0;
        int firstNumber = array[1];
        int secondNumber = 0;
        int leastCommonMultipleNumber;

        for (int i = 3; i < array.length; i++) {
            if (i % 2 != 0) {
                secondNumber = array[i];
            }

            leastCommonMultipleNumber = leastCommonMultiple(firstNumber, secondNumber);

            if (leastCommonMultipleNumber > 0) {

                firstNumber = leastCommonMultipleNumber;
            } else {
                firstNumber = 0;
                break;
            }
        }
        return firstNumber;

    }

    //
    private static void fraction(int[] array, int denominator, int[] resultArray) {
        boolean isCorrect = true;
        int j = 0;
        int factor = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0 && i < array.length - 1) {
                factor = denominator / array[i + 1];
                if (Integer.MAX_VALUE / factor >= array[i]) {
                    resultArray[j] = array[i] * factor;
                    j++;
                } else {
                    System.out.println("Enter correct numbers. Result of multiply is too big!");
                    isCorrect = false;
                    break;
                }

            }
        }

        if (isCorrect == true) {

            insertSort(resultArray);

            for (int i = 0; i < resultArray.length; i++) {
                String str = Integer.toString(resultArray[i]);
                String strDenominator = Integer.toString(denominator);
                System.out.print(str + "/" + strDenominator + "; ");
            }
        }
    }

    //
    private static void insertSort(int[] array) {
        int bufer = 0;
        for (int i = 1; i < array.length; i++) {
            while (array[i] < array[i - 1] && i != 0) {
                bufer = array[i];
                array[i] = array[i - 1];
                array[i - 1] = bufer;
                if (i > 1) {
                    i--;
                }
            }
        }
    }


}