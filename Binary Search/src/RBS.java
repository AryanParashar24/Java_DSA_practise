public class RBS {

    //                                       LEETCODE LINK:--
    //                https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/882782211/
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        //if you did not find  apivot , it means the array is not rotated
        if (pivot == -1){
            //just do nromal binary search
            return binarySearch(nums, target, 0,nums.length-1);
        }

        //if pivot is found , you have to found 2 asc sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot- 1);
        }
        return binarySearch(nums, target, pivot+1, nums.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2; //might be possible that we r working on an array that is very vy large in size and int value is limited only to a certain value
            //so if it exceeds that number thhen it might not allow that number and might give an error so for that:--

            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }

    //Thhis will not work in duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {    // So here && meant that if the first element didn't work out then the another one will not even run and finally both the
                return mid;                                       //codes needed to be true for it
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {    // So here && meant that if the first element didn't work out then the another one will not even run and finally both the
                return mid;                                       //codes needed to be true for it
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //if elements at middle,satrt , end are equal then just skip the duplicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicate
                //NOte:- what if tehse elements at start and end were the pivot
                //check if strat is pivot

                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                //check wheather end is pivot
                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
            }
            //left side is sorted so the pivot should be in right side
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
