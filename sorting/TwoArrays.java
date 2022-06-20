package by.holikov.javaIntroduction.algorithmization.sorting;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив

public class TwoArrays {
    public static void main(String[] args) {

        int oneArrayLength = 10;
        int twoArrayLength = 7;

        if (oneArrayLength < twoArrayLength) {
            int bufer = oneArrayLength;
            oneArrayLength = twoArrayLength;
            twoArrayLength = bufer;
        }

        int[] oneArray = new int[oneArrayLength + twoArrayLength];

        int k = (int) (Math.random() * oneArrayLength);

        createRandomArray(oneArray, oneArrayLength);
        System.out.println("One array:");
        arrayPrint(oneArray);

        int[] twoArray = new int[twoArrayLength];
        createRandomArray(twoArray, twoArrayLength);
        System.out.println("Two array:");
        arrayPrint(twoArray);

        insertArray(oneArray,oneArrayLength, k, twoArray);

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

    //
    private static void insertArray(int[] oneArray, int oneArrayLength, int position, int[] twoArray) {
        int counter = 1;

        for (int i = oneArrayLength - 1; i > position; i--) { //
            int pos = oneArray.length - counter;
            oneArray[pos] = oneArray[i];
            int byfer = oneArray[i];
            oneArray[i] = 0;
            counter++;
        }
        int j = 0;
        for (int i = position + 1; i < oneArray.length; i++) {
            if (j < twoArray.length) {
                oneArray[i] = twoArray[j];
                j++;
            }
        }

        System.out.println("Concatenated array from position " + position + ":");
        arrayPrint(oneArray);

    }

}

