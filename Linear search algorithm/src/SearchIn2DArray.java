import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {            //Here we may ask why aren't we adding new int{} here as we already declaring it when we have initialised it inro this kinda
                {23, 74,1},         //arraytype with int[][] arr = ...  then we have already declared it over here bt it isn't same for the stuff when we r asking it to
                {45, 4, 5, 16},       // return some sort of value as over there we aren't declaring its data type so we have to dedeclare it first
                {12, 24},
                {34, 55,67, 12},
        };
        int target = 24;
        int[] ans = search(arr,target); // format of the return value{row, col}
        System.out.println(Arrays.toString(ans));

        System.out.print(max(arr));
        System.out.print(" which is greater then " + Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};  //Why we added new int here for the reason look it up in the multidimentional array
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
//            int[] ints = arr[i];
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
