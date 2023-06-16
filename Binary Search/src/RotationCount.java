public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        if (pivot == -1){
            //array is not rotated
            return 0;
        }
        return pivot +1;
    }
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
            else if(arr[start]  arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
