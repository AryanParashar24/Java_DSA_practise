public class FirstAndLastPosition {

    //                                                              LeetCode Link:
    //                            https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {   //Just because it is given on leetcode

        int[] ans = {-1, -1};
        //check for first occurence  if target first
        ans[0]  = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; //might be possible that we r working on an array that is very vy large in size and int value is limited only to a certain value
            //so if it exceeds that number thhen it might not allow that number and might give an error so for that:--
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if (findStartindex) {
                    end = mid - 1;
                } else {
                    start = mid - 1;
                }
            }
        }
        return ans;
    }
}
