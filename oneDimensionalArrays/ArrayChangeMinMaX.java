package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

public class ArrayChangeMinMaX {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int[] changeArray = new int[10];

        createRandomArray(myArray);
        arrayPrint(myArray);

        changeMinMax(myArray, changeArray);

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
    private static int findMinPosition(int[] array) {
        int min = 0;
        int positionMin = 0;
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                positionMin = i;
            }
        }
        return positionMin;
    }

    //
    private static int findMaxPosition(int[] array) {
        int max = 0;
        int positionMax = 0;
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                positionMax = i;
            }
        }
        return positionMax;
    }

    //
    private static void changeMinMax(int[] array, int[] changeArray) {
        int positionMin;
        int positionMax;
        int changeMin = 0;
        int changeMax = 0;
        positionMin = findMinPosition(array);
        positionMax = findMaxPosition(array);

        for (int i = 0; i < array.length; i++) {
            if (i == positionMin) {
                changeMin = array[i];
            }

            if (i == positionMax) {
                changeMax = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (positionMin == i) {
                changeArray[i] = changeMax;
            }
            if (positionMax == i) {
                changeArray[i] = changeMin;
            } else if (positionMax != i && positionMin != i) {
                changeArray[i] = array[i];
            }
        }

        arrayPrint(changeArray);
        System.out.println("Min array element: " + changeMin + '\n' + "Max array element: " + changeMax);
    }

}