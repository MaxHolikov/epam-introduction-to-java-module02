package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;
//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class ArrayReplaceZeroNum {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        createRandomArray(myArray);
        arrayPrint(myArray);
        replaceZeroNum(myArray);
    }

    private static void createRandomArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
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
    private static void replaceZeroNum(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        arrayPrint(array);

// сортировка, нули направо
        boolean isSorted = false;
        int buffer;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != 0) {
                left++;}
            if (array[right] == 0) {
                right--;}
            if (array[left] == 0 && array[right] != 0 && left < right) {
                array[left] = array[right];
                array[right] = 0;
                left++;
                right--;
            }
        }

        arrayPrint(array);
    }

}
