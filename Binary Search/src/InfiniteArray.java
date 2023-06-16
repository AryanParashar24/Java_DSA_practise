public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        //first find the range
        //first start with the box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            //double the box value
            //end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
                    //so its kind of saying that for example we have an array with the indexes as 0,1,2,3,4,5,6... so if the target > arr[end] then the previous array was
            //0,1 so the new end of the array will be end = 1(previous start) + 4(2*length of the previous array) = 5(index of the new start of the new array)
        }
        return binarySearch(arr, target, start, end);
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
}
