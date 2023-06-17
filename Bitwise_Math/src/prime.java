public class prime {
    public static void main(String[] args) {
        int n = 37;
//        int[] nums = {2,3,5,7};

        for (int i = 1; i <= n ; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

//    static boolean PrimeRange(int n){
//        if(n <= 1){
//            return false;
//        }
//
//        for (int i = nums[0]; i < nums.length; i++) {
//
//        }
//    }
}