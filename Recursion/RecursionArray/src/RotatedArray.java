public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,4,5,6,7};
        System.out.println(search(arr, 9, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        if (target <= arr[e] && target >= arr[m]) {
            return search(arr, target, m + 1, e);
        } else {
            return search(arr, target, s, m - 1);
        }
    }
}
