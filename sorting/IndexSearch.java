package by.holikov.javaIntroduction.algorithmization.sorting;

//Даны дроби p1/q1, p2/q2, ... , pn/qn. (pi, qi - натуральные). Составить программу, которая приводит эти дроби
//к общему знаменателю и упорядочивает их в порядке возрастания.

public class IndexSearch {

    public static void main(String[] args) {

        int[] oneArray = new int[] {1,4,6,8,12};
        int[] twoArray = new int[] {0,1,2,4,7,8,10,14,16};
        arrayPrint(oneArray);
        arrayPrint(twoArray);
        int[] indexArray = new int[twoArray.length];

        for (int i=0; i < twoArray.length;i++) {

            if (oneArray[oneArray.length-1] <= twoArray[i]){
                indexArray[i]=oneArray.length+i;
            }
            else {
                for (int j=0; j < oneArray.length; j++){
                    if (twoArray[i] <= oneArray[j]){
                        indexArray[i]=j+i;
                        break;
                    }
                }
            }

        }
        arrayPrint(indexArray);

        }

    //
    private static void arrayPrint(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}