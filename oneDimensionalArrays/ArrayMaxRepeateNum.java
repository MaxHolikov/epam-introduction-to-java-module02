package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

import java.util.Arrays;

public class ArrayMaxRepeateNum {

    public static void main(String[] args) {

        int[] myArray = new int[]{0, 4, 6, 8, -121, 4, -121, 1, 1, 0, 4};
        int[] arrayCopy = new int[myArray.length];

        arrayCopy = Arrays.copyOf(myArray,myArray.length);
        arrayPrint(arrayCopy);

        sortBubble(arrayCopy);
        findRepeateNum(arrayCopy);
    }

    private static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //
    private static void sortBubble(int[] array) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
        arrayPrint(array);
    }

    //
    private static void findRepeateNum(int[] sortArray) {
    int maxRepeate=0;
    int repeate=0;
    int buferNum=0;
        for (int i = 0; i < sortArray.length-1; i++) {
            if (sortArray[i]==sortArray[i+1]) {
                repeate++;
            }
            if (sortArray[i]<sortArray[i+1] && maxRepeate<repeate){
                maxRepeate=repeate;
                buferNum=sortArray[i];
                repeate=0;
            }
            else if (sortArray[i]<sortArray[i+1] && maxRepeate>=repeate) {
                repeate=0;
            }
        }
        System.out.println("Max repeate element: "+buferNum);
    }


}
