public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 45, 87, 12, -23, 22};
        System.out.println(min(arr));
        System.out.println(factorial(5));
        System.out.println(sum(6667));
        System.out.println(product(6667));
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

    static int factorial(int n){
        if(n==1){
            return 1;
        }
        n *= factorial(n-1);
        return n;
    }

    static int sum(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) + sum(n/10);
    }
    static int product(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * product(n/10);
    }
}
