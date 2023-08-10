public class Main {
        public static void main(String[] args) {
            System.out.println(factorial(5));
            System.out.println(sum(6667));
            System.out.println(product(6667));
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