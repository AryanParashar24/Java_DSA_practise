import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4};

        bubble(arr,arr.length-1, 0);
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }

    /*As we have already studied about it whenever we need to repeat something and pass any variable in the future function calls then we will need to put that
    the variable in the argument of the function */
    static void selection(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
