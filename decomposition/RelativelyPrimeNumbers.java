package by.holikov.javaIntroduction.algorithmization.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class RelativelyPrimeNumbers {

    public static void main(String[] args) {
        int[] myArray = new int[]{7, 12, 5};
        boolean relativelyPrimeNumbers;

        try {
            relativelyPrimeNumbers = correctInputValue(myArray[0], myArray[1], myArray[2]);
            if (relativelyPrimeNumbers == true){
            System.out.println("Correct, relatively prime numbers");}

            else {System.out.println("Incorrect! Numbers are not coprime!");}

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int maxNumber;
        int result = 0;

        if (firstNumber >= secondNumber) {
            maxNumber = firstNumber;
        } else {
            maxNumber = secondNumber;
        }

        for (int i = 1; i <= maxNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                result = i;
            }
        }

        return result;
    }

    //
    private static boolean correctInputValue(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Numbers must be natural!");
        }

        if (greatestCommonDivisor(a, b) == 1 && greatestCommonDivisor(a, c) == 1 &&greatestCommonDivisor(b, c) == 1) {
            return true;
        }
        else {return false;}


    }
}
