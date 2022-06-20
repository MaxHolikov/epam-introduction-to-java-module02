package by.holikov.javaIntroduction.algorithmization.sorting;
// Cортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если
// ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка
// и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

public class ShellSort {
    public static void main(String[] args) {

        int[] myArray = new int[15];

        createRandomArray(myArray);
        arrayPrint(myArray);

        shellSort(myArray);

    }

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
    private static void shellSort(int[] array) {
        int bufer = 0;
        for (int i = 0; i < array.length - 1; i++) {
            while (array[i] > array[i + 1]) {
                bufer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = bufer;
                if (i > 0) {
                    i--;
                }
            }
        }
        arrayPrint(array);
    }
}