package by.holikov.javaIntroduction.algorithmization.decomposition;

public class SecondMaxElem {

    public static void main(String[] args) {
        int[] myArray;
        int secondMax;
        myArray = new int[]{0, -1, 1, 0, 5, 2, 3, -1};

        secondMax=findSecondMax(myArray);
        System.out.println(secondMax);
    }

    private static int findMax(int[] array) {
        int max;
        max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private static int findSecondMax(int[] array) {
        int max;
        int secondMax = 0;
        max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            if (max != array[i]) {
                secondMax = array[i];
            }
            break;
        }

        for (int i = 0; i < array.length; i++) {
            if (max > array[i] && secondMax < array[i]) {
                secondMax = array[i];

            }
        }
        return secondMax;
    }
}




