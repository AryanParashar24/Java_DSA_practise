import java.util.Arrays;
import java.util.Scanner;

public class MutliDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         /*
        int[][] arr = new int[5][];
          int[][] arr = new int[row][column]
        Filling up row is mandatory but filling up column is not mandatory  */

//        int[][] arr = new int[
//            {1 2 3},
//            {4 5 6},
//            {7 8 9}
//        ];
        /* In C and C++ even 2D Arrays are continous

        [  [1,2,3]
           [4,5,6]
           [7,8,9]


           So Imagine it as an array of arrays where its an array and inside it [1,2,3]will also be a part of an array actually

           So arr[1]---> [4,5,6]
           arr[1][0]---> 4

           also the size of the rows does not matter so it can be variable
        */
        Scanner in = new Scanner(System.in);

//        int[][] arr = new int[3][];
//        int[] arr2D = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        //System.out.println(arr.length);// will giev you no. of rows

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }//So in simple words  outer for loop is used to iterate the rows while onto the other hand columns are being itterated by another for loop inside the previous one
        }
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + "");
//            }
//            System.out.println();


        //  Or Instead we may use for loop instead inspite of putting out the whole for loop for column inspite of it !!

//        for (int row = 0; row < arr[row].length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

                 //OR just do

        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        //Datatype of veery single thing in array is itself is an array!!
    }
}
