package by.holikov.javaIntroduction.algorithmization.sorting;

//Cортировка вставками. Дана последовательность чисел a1 ,a2 , ... ,an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
//a1, a2, ... , ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an. Берется следующее число ai+1
//и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
// Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
// Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class InsertBinarySort {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        createRandomArray(myArray);
        arrayPrint(myArray);
        //insertSort(myArray);
        insertBinarySort(myArray);

    }

    //
    private static void createRandomArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
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
        System.out.println("Sort array:");
        arrayPrint(array);
    }

    //

    private static void insertBinarySort(int[] array) {
        int tempIndex;
        int currentValue;

        for (int i = 1; i < array.length; i++) {
            tempIndex = searchIndex(array, i - 1, array[i]);
            currentValue = array[i];

            for (int j = i; j > tempIndex; j--) {
                array[j] = array[j - 1];
            }
            array[tempIndex] = currentValue;
        }

        System.out.println("Sort array:");
        arrayPrint(array);

    }

//
    public static int searchIndex(int[] array, int lastIndex, int valueForInsert) {
        int firstIndex = 0;
        int middleIndex;

        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == valueForInsert) {
                return middleIndex;

            } else if (array[middleIndex] < valueForInsert) {
                firstIndex = middleIndex + 1;

            } else if (array[middleIndex] > valueForInsert) {
                lastIndex = middleIndex - 1;
            }
        }
        return firstIndex;
    }


}