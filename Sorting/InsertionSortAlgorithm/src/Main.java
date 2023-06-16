import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }


    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in the array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void bubble(int[] arr) {
        //So the below code is runned and since w akready placed a sorted array so no swaping is occured but if the swapping is done then
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step , max item will come at last repective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller then the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            //if you did not swapped fgor a particular value of i , it means that the array is sorted otherwise just swap
            if (!swapped) {
                break;// If you really wanna see this false and true conditioning and where the function is breaking then just see the de bugging command in it
            }
        }
    }
}