public class Reverse {
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = 10 * sum + rem;
        reverse(n/10);
    }

    static int digits(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return rev2(n, digit);
    }

    private static int rev2(int n, int digit){
        if(n%10==n){
            return n;
        }
        int rem = n % 10;
        return (int)((Math.pow(10, digit - 1)) * rem) + rev2(n/10, digit-1);
    }

    static boolean palin(int n){
        return (n == digits(n));
    }

    public static void main(String[] args) {
        reverse(56789);
//        System.out.println(sum);
        System.out.println(digits(1234));
        System.out.println(palin(1234321));
    }
}
