import java.util.Arrays;

public class StableAndUnstableSort {

    //when the original order is maintained for the values that are equal that is stable sorting when the original order is maintained
    //when two or more values are same
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //So the below code is runned and since w akready placed a sorted array so no swaping is occured but if the swapping is done then
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step , max item will come at last repective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller then the previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if you did not swapped fgor a particular value of i , it means that the array is sorted otherwise just swap
            if (!swapped){
                break;// If you really wanna see this false and true conditioning and where the function is breaking then just see the de bugging command in it
            }
        }
    }
}