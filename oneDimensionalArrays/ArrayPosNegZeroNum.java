package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class ArrayPosNegZeroNum {

    public static void main(String[] args) {
        int N = 10;
        int[] myArray = new int[N];
        String howMuchArraysElements;
        createRandomArray(myArray);
        arrayPrint(myArray);
        howMuchArraysElements = howMuchPosNegZeroArrNum(myArray);
        System.out.println(howMuchArraysElements);
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
    private static String howMuchPosNegZeroArrNum(int[] array) {
        int positive = 0;
        String text_pos = "Number of positive array elements: ";
        int negative = 0;
        String text_neg = "number of negative array elements: ";
        int zero = 0;
        String text_zero = "number of zero array elements: ";
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if ((array[i] < 0)) {
                negative++;
            } else {
                zero++;
            }
        }
        result = text_pos + Integer.toString(positive) + '\n' + text_neg + Integer.toString(negative) + '\n' + text_zero + Integer.toString(zero);
        return result;

    }

}
