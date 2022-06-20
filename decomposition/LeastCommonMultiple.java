package by.holikov.javaIntroduction.algorithmization.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел: НОК (a, b) = a*b / НОД (a, b)

import javax.xml.bind.SchemaOutputResolver;

public class LeastCommonMultiple {
    public static void main(String[] args) {

        int a;
        int b;

        a = 21;
        b = 39  ;

        intgreatestCommonDivisor(a, b);

        leastCommonMultiple(a, b);

    }

    //
    private static int intgreatestCommonDivisor(int firstNumber, int secondNumber) {

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

        int result = 0;  // leastCommonMultiple
        int intgreatestCommonDivisorNumber;

        if (Integer.MAX_VALUE / firstNumber >= secondNumber) {
            if (firstNumber > 0 && secondNumber > 0) {
                intgreatestCommonDivisorNumber = intgreatestCommonDivisor(firstNumber, secondNumber);

                result = (firstNumber / intgreatestCommonDivisorNumber) * secondNumber;
                System.out.println("Least common multiple: " + result);
            } else {
                System.out.println("Enter correct numbers");
            }
        }
        else {System.out.println("Enter correct numbers. Result of multiply: " + firstNumber +" * " + secondNumber +" is too big!");}

            return result;
        }
    }
