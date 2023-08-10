public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {            //Here we may ask why aren't we adding new int{} here as we already declaring it when we have initialised it into this kinda
                {23, 74},         //arraytype with int[][] arr = ...  then we have already declared it over here but it isn't same for the stuff when we r asking it to
                {45, 4},       // return some sort of value as over there we aren't declaring its data type so we have to dedeclare it first
                {12, 24},
                {34, 55},
        };
        int maxWealth = MaxWealth.maximumWealth(arr);
        System.out.println("Maximum Wealth: " + maxWealth);
    }
    static int maximumWealth(int[][] accounts){
        //person = rol
        //account = col
        int maxWealth = Integer.MIN_VALUE;
//        for (int[] ints : accounts) {
        for (int i = 0; i < accounts.length; i++) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
//            for (int accounts : ints) {
//                sum += accounts;
//            }
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
            //now we have sum of the account of the personof person
            //check with overall ans
//            if (sum > ans) {
//                ans = sum;
//            }
        }
//        return ans;
        return maxWealth;
    }
}
