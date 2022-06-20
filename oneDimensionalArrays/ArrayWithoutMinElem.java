package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

//Дана последовательность чисел а1,а2,а3...аn. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(а1,а2,а3...аn).

public class ArrayWithoutMinElem {

    public static void main(String[] args) {

        // int[] myArray = new int[] {-11,4,6,8,-121,4,-121,1,1,3};
        int lengthArrayWithoutMin;
        int[] myArray = new int[10];
        createRandomArray(myArray);


        lengthArrayWithoutMin = findLengthArrayWithoutMin(myArray);
        int[] arrayWithoutMin = new int[lengthArrayWithoutMin];

        System.out.println("Number(s) of minimum element(s): "+ (myArray.length-lengthArrayWithoutMin));
        System.out.println("Minimum element: "+ findMin(myArray));

        findArrayWithoutMin(myArray,arrayWithoutMin);
        arrayPrint(myArray);
        arrayPrint(arrayWithoutMin);

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
    private static int findMin(int[] array) {
        int min = 0;
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

//
    private static int findLengthArrayWithoutMin(int[] array) {
        int lengthWithoutMin = array.length;
        int min = findMin(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                lengthWithoutMin--;
            }
        }
        return lengthWithoutMin;
    }

//
    private static void findArrayWithoutMin(int[] array, int [] arrayWithoutMin) {
        int min = findMin(array);
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=min) {
                arrayWithoutMin[j]=array[i];
                j++;
            }
        }
    }
}