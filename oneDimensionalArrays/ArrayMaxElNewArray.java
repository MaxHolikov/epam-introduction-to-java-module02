package by.holikov.javaIntroduction.algorithmization.oneDimensionalArrays;

//Даны действительные числа а1,а2,а3...аn и надо найти max(a1+a2n,a2+a2n-1...an+an+1)
public class ArrayMaxElNewArray {

    public static void main(String[] args) {

        double[] myArray = new double[10];
        double[] newArray = new double[myArray.length / 2];
        createRandomArray(myArray);
        creatNewArray(myArray, newArray);
        arrayPrint(myArray);
        arrayPrint(newArray);
        findMax(newArray);
    }

    //
    private static void createRandomArray(double[] array) {
        double scale = Math.pow(10, 3);
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((Math.random() * 201 - 100) * scale) / scale;
        }
    }

    //
    private static void arrayPrint(double[] array) {
        double scale = Math.pow(10, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.print(Math.ceil(array[i] * scale) / scale + " ");
        }
        System.out.println();
    }

    //
    private static void creatNewArray(double[] array, double[] newArray) {
        for (int i = 0; i < array.length / 2; i++) {
            if (i == 0) {
                newArray[i] = array[i] + array[array.length - 1];
            } else if (i != array.length / 2) {
                newArray[i] = array[i] + array[(array.length - 1 - i)];
            } else if (i == array.length / 2) {
                newArray[i] = array[i] + array[i + 1];
            }
        }
    }

    //
    private static void findMax(double[] array) {
        double max = 0;
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max element of array type (a1+a2n,a2+a2n-1...an+an+1): " + max);
    }
}