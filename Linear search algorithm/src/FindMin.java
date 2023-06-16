public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 45, 87, 12, -23, 22};
        System.out.println(min(arr));
    }

    //Asssume arr.length is not equal to 0
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
