package by.holikov.javaIntroduction.algorithmization.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int[] myArray = new int[]{0, 120 , 150, 256};
        int gtsAllNumber;


        try {
            gtsAllNumber=correctInputValue(myArray[0], myArray[1], myArray[2], myArray[3]);
            System.out.println("gtsAllNumber= "+gtsAllNumber);
        }
        catch (IllegalArgumentException exception) {
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
    private static int correctInputValue(int a, int b, int c, int d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            throw new IllegalArgumentException("Numbers must be natural!");
        }

        return greatestCommonDivisor(greatestCommonDivisor(a, b), greatestCommonDivisor(c, d));
    }
}


