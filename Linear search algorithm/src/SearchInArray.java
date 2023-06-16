public class SearchInArray {
    public static void main(String[] args) {

        int[] arr = {18, 45, 87, 12, -23, 22};
        int target = 45;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
