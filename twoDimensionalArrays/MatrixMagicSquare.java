package by.holikov.javaIntroduction.algorithmization.twoDimensionalArrays;

import java.util.Scanner;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат.

public class MatrixMagicSquare {
    public static void main(String[] args) {

        int n;
        n=enterFromConsol();
        int[][] myArray = new int[n][n];
        createZeroArray(myArray);

        if (n%2!=0){  // Нечетный порядок
            oddMagicSquare(myArray);
        }else if (n%4!=0){  // Одиночный и четный порядок
            System.out.println("Error,create metod for even Magic Square");
            return;
        }else{  // Двойной четный порядок

           doubleEvenMagic(myArray);
        }



        //oddMagicSquare(myArray);

        arrayPrint(myArray);


    }

    private static int enterFromConsol() {
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you positive number: ");
        int positiveNumber;
        positiveNumber = 0;
        while (!isCorrect) {
            while (!sc.hasNextInt()) {
                String str = sc.next();
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println("Enter positive number: ");
                isCorrect = false;
            }
            if (sc.hasNextInt()) {
                positiveNumber = sc.nextInt();

                if (positiveNumber < 1 || positiveNumber > 10) {
                    isCorrect = false;
                    System.out.println("Your number isn`t correct. Do it again");
                    System.out.println("Enter positive number: ");
                }

                if (positiveNumber >= 1 && positiveNumber <= 10) {
                    isCorrect = true;
                    System.out.println(positiveNumber);
                    break;
                }
            }
        }
        return positiveNumber;

    }

    //

    private static void createZeroArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
    }

    //
    private static void oddMagicSquare(int[][] array) {
        int n = array.length;
        int i = 0;
        int j = n / 2;
        for (int k = 1; k <= n * n; k++) {
            array[i][j] = k;
            if (k % n == 0) {  // Если текущее число кратно n, спускаемся вниз
                i++;
            } else {  // Если текущее число не кратно n, идем вверх влево
                i--;
                j++;
                if (i < 0){
                    i = n - 1;
                }
                if (j > n - 1) {
                    j = 0;}
            }
        }
    }

//
    public static void doubleEvenMagic(int array[][]){
        int n = array.length;
        int c1=1, c2=n*n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%4==j%4 ||(i+j)%4==3){  // Диагональ перевернута
                    array[i][j] = c2;
                }else{  // Недиагональный передний ряд
                    array[i][j] = c1;
                }
                c2--;
                c1++;
            }
        }
    }


    //
    private static void arrayPrint(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

