public class SearchInMountain {
    public static void main(String[] args) {
    }

    //                                     LEETCODE LINK
   //         https://leetcode.com/problems/find-in-mountain-array/description/

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        //otherwise try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you ar ein dec part of array
                //this may be the ans ,but look at left
                //this is why end!= mid - 1
                end = mid;
            } else {
                //you are in the asc part of array
                start = mid + 1;//because we know that mid +1 element > mid element
            }
        }
        //in the end , start == end and pointing to the largest number because of the two checks above
        //start and end are always trying to find the max element in the abov e2 chacks hence when they ar ejust
        //pointing to just element then thats the answer because that is what the checks say
        //more elaboration at every point of time of start of time for start and end ,they have the best possible answer till that time
        //and if we ar esaying that only one item is remaining because of above line then that is the best possible ans

        return start; //or return end as both are equal
    }
    static int orderAgnosticBS(int[]arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;

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
