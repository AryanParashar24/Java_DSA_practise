import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 0, 10};
//        sort(arr, 0, arr.length -1);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int high){
        if (low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while (s <= e){

            //Also a reason if ita already sorted then merge sort will nt swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //now we pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, high);
    }
}