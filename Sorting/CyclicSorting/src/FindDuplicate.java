public class FindDuplicate {

    //                       LEETCODE
    //https://leetcode.com/problems/find-the-duplicate-number/
    //                     MICROSOFT INTERVIEW

    public int findDuplicate(int[] arr){
        int i = 0;   //Here list is been provided because the answer can be of various size so thatswhy list is been given
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
