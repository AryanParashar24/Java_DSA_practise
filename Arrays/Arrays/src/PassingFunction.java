
               //Strings are Immutable in java but Arrays are mutable in java mutable only means that they can be changed

import java.util.Arrays;
public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
