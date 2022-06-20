package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

public class MatrixCreate {

    public static void main(String[] args) {

        int n = 8;
        int[][] myArray = new int[n][n];

        // 1,  2,  3 ,.., n
        // n, n-1, n-2,..., 1
        // 1,  2,  3 ,.., n
        // n, n-1, n-2,..., 1
        // ...
        // n, n-1, n-2,..., 1

        //  createMatrixTypeOne(myArray);

        // 1,  1,  1, ..., 1, 1, 1
        // 2,  2,  2, ..., 2, 2, 0
        // 3,  3,  3, ..., 3, 0, 0
        // ...
        // n-1,n-1,0, ..., 0, 0, 0
        //  n, 0, 0,  ..., 0, 0, 0

        //  createMatrixTypeTwo(myArray);

        // 1,  1,  1, ..., 1, 1, 1
        // 0,  1,  1, ..., 1, 1, 0
        // 0,  0,  1, ..., 1, 0, 0
        // ...
        // 0,  1,  1, ..., 1, 1, 0
        // 1,  1,  1, ..., 1, 1, 1

        //  createMatrixTypeThree(myArray);

        // Сформировать квадратную матрицу порядка N по правилу: A[I,J]=sin( (I^2-J^2)/N) ),
        // и подсчитать количество положительных элементов в ней
    /*    int k = 2;
        double[][] myFourArray = new double[k][k];
        createMatrixTypeFour(myFourArray, k);
    */

        //   Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        //   единиц равно номеру столбца.

        createMatrixTypeFive();

    }

    //
    private static void arrayPrint(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 1,  2,  3 ,.., n
    // n, n-1, n-2,..., 1
    // 1,  2,  3 ,.., n
    // n, n-1, n-2,..., 1
    // ...
    // n, n-1, n-2,..., 1

    private static void createMatrixTypeOne(int[][] array) {
        System.out.println("Matrix type One: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                }
                if (i % 2 != 0) {
                    array[i][j] = array.length - j;
                }
            }
        }
        arrayPrint(array);
        System.out.println("=================");
    }

    // 1,  1,  1, ..., 1, 1, 1
    // 2,  2,  2, ..., 2, 2, 0
    // 3,  3,  3, ..., 3, 0, 0
    // ...
    // n-1,n-1,0, ..., 0, 0, 0
    //  n, 0, 0,  ..., 0, 0, 0

    private static void createMatrixTypeTwo(int[][] array) {
        System.out.println("Matrix type Two: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j <= array.length - 1) {
                    array[i][j] = i + 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        arrayPrint(array);
        System.out.println("=================");
    }


    // 1,  1,  1, ..., 1, 1, 1
    // 0,  1,  1, ..., 1, 1, 0
    // 0,  0,  1, ..., 1, 0, 0
    // ...
    // 0,  1,  1, ..., 1, 1, 0
    // 1,  1,  1, ..., 1, 1, 1

    private static void createMatrixTypeThree(int[][] array) {
        System.out.println("Matrix type Three: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if ((i + j < 2 * i && i + j < array.length - 1) || (i + j > array.length - 1 && i + j > 2 * i)) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        arrayPrint(array);
        System.out.println("=================");
    }


    // Сформировать квадратную матрицу порядка N по правилу: A[I,J]=sin( (I^2-J^2)/N) ),
    // и подсчитать количество положительных элементов в ней

    private static void createMatrixTypeFour(double[][] array, int line) {
        System.out.println("Matrix type Four: ");
        int scale = 100;
        int numPosElemets = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double result = Math.sin((i * i - j * j) / line);
                array[i][j] = Math.ceil(result * scale) / scale;
                if (array[i][j] > 0) {
                    numPosElemets++;
                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    System.out.print(array[i][j] + "\t    ");
                } else {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("Number of positive elements in matrix type A[I,J]=sin((I^2-J^2)/N): " + numPosElemets);
    }

    //Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    //единиц равно номеру столбца.

    private static void createMatrixTypeFive() {

        int m, n;
        n = (int) (Math.random() * 10)+1;
        m = (int) (Math.random() * 10)+1;

        if (m < n) {
            int bufer;
            bufer=m;
            m=n;
            n=bufer;
        }

        int[][] randomArray = new int[m][n];
        int randomNum=0, counter=0;
        //create ZeroArray
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                 randomArray[i][j]=0;
                 }
            }

        for (int j = 0; j < randomArray[0].length; j++) {
            while (true) {
                if (counter == j) {
                    break;}

                int i = (int) (Math.random()*randomArray.length);
                if (randomArray[i][j]==0){
                    randomArray[i][j]=1;
                    counter++;
                }
            }
            counter=0;
        }
        arrayPrint(randomArray);
    }


}