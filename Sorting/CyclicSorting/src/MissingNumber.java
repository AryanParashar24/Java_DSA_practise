import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;


//                  LEETCODE
//        https://leetcode.com/problems/missing-number/submissions/887391827/
//                     AMAZON QUESTION


//in this one we will find the missing number as when we will find two numbers not in the series of continous numbers as for example 2 and then 4 is present then the
//missing number will be the index number of the greater number that is 4's index number will be the answer and in case we are asked to find the missing number of a sorted array
//then in that the missing number will be the length of the array.
 class MissingNumber {


    //ALWAYS REMEMBER:-- WHENEVER A RANGE IS GIVEN FROM 1 TO N THEN UST USE CYCLIC SORTING

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        //case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

