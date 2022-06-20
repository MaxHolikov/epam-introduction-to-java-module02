package by.holikov.javaIntroduction.algorithmization.sorting;

// Даны две последовательности a1<= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую последовательность
// чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
public class TwoRows {

    public static void main(String[] args) {

        int oneArrayLength = 3;
        int twoArrayLength = 2;

        if (oneArrayLength < twoArrayLength) {
            int bufer = oneArrayLength;
            oneArrayLength = twoArrayLength;
            twoArrayLength = bufer;
        }

        int[] oneArray = new int[oneArrayLength + twoArrayLength];

        createRandomArray(oneArray, oneArrayLength);
        sortBubble(oneArray, oneArrayLength);
        System.out.println("One array:");
        arrayPrint(oneArray);

        int[] twoArray = new int[twoArrayLength];
        createRandomArray(twoArray, twoArrayLength);
        sortBubble(twoArray, twoArrayLength);
        System.out.println("Two array:");
        arrayPrint(twoArray);
        insertArray(oneArray, oneArrayLength, twoArray);

    }

    //
    private static void createRandomArray(int[] array, int arrayLength) {

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 21) - 20;
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
    public static void sortBubble(int[] array, int arrayLength) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
    }

    //
    private static int findMax(int[] array, int arrayLength) {
        int max = array[0];
        for (int i = 0; i < arrayLength; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private static void insertArray(int[] oneArray, int oneArrayLength, int[] twoArray) {
        int j = 0;
        for (int i = oneArrayLength; i < oneArray.length; i++) {
            oneArray[i] = twoArray[j];
            j++;
        }

        System.out.println("Result sort array: ");
        sortBubble(oneArray,oneArray.length);
        arrayPrint(oneArray);

    }
}