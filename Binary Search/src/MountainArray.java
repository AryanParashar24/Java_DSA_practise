public class MountainArray {
    public static void main(String[] args) {

    }

                          //LEETCODE LINK
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/

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
}
