package by.holikov.javaIntroduction.algorithmization.sorting;

//Сортировка выбором. Дана последовательность чисел
//a1<= a2 <= ... <= an.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором

public class SelectionBubbleSort {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        createRandomArray(myArray);
        arrayPrint(myArray);
        sortBubble(myArray);

        selectionSort(myArray);

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

    //SortBubble
    private static void sortBubble(int[] array) {
        boolean isSorted = false;
        int buffer;
        int counter=0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    counter++;
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
        System.out.println("After SortBubble:");
        arrayPrint(array);
        System.out.println("Number of permutations:"+counter);
    }

    //
    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxId = i;
            //find max element
            for (int j = i + 1; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                    maxId = j;
                }
            }
            int bufer = array[i];
            array[i] = max;
            array[maxId] = bufer;
        }
        System.out.println("After selectionSort");
        arrayPrint(array);
    }

}

