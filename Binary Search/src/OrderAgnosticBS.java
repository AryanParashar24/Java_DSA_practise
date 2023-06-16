public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-12,-9,-2,3,4,5,16,34,64};
        int target = 34;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find wheather the array is been sorted in ascending or in descending order
        boolean isAsc = arr[start] < arr[end]; // Since its an expression therefore i can directly add this whole expression directly

        while(start <= end){
              //find the middle element
            //int mid = (start + end) / 2; //might be possible that we r working on an array that is very vy large in size and int value is limited only to a certain value
            //so if it exceeds that number thhen it might not allow that number and might give an error so for that:--

            int mid = start + (end - start) /2;
            for (int i = 0; i <arr.length; i++) {
                
            }

            if(arr[mid] ==target){
                return mid;
            }
            if (isAsc){
               if(target < arr[mid]){
                end = mid - 1;
                }else{
                start = mid + 1;
               }
            }else{
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
