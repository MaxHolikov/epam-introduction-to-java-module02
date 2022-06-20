package by.holikov.javaIntroduction.algorithmization.decomposition;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.util.Arrays;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        int[][] points;
        double[] distance;
        points = new int[][]{{0, -1}, {1, 0}, {5, 2}, {3, 1}};
        distance = new double[]{};



        //arrayPrint(points);

    }

    private static void arrayPrint(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+";");
            }
            System.out.print("}");
            System.out.println();
        }
    }


   private static void distance(double[][] inputArray, double[] outputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray.length-1; j++){



            }
        }
    }


}