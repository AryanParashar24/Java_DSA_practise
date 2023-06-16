public class Ceiling {
    /* Here in the ceiling we will be using the binary search so as to first of all reduce the steps and then later when we will reach to the
    final sort and does not find the target then we will find that the WHEN loop condition is being violated and when it has happened then that
    the ans does not lie in that range so the answer is outside somewhere but nt in the range and thus loop will be violated by making the end as
    the start and start > end and into that way when it will begin iterating through every element in that range for the target and when it will
    not find that then even the end will not exist for it and thus the start will bethe answer as the target is not in the range thus it will
    return the start of the range and thus in this way our question will get solved finally THUS GIVING US CONDITION as  START = END + 1 & START > END
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index: the smallest number greater than equal to the target
        static int ceiling(int[] arr, int target){

        //but what if the target element is greater then the gretest number in the array
            if(target >= arr[arr.length - 1]){
                return -1;
            }
            int start = 0;
            int end = arr.length - 1;

            while(start <= end){
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
            return start;
    }
}
