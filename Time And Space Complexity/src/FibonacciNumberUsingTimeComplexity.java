public class FibonacciNumberUsingTimeComplexity {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(fiboFormula(i));
        }

        System.out.println("Now for a particular 50th term:");

        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
       // return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n));      after ignoring all the constants & less dominating terms IF NOT then:--
        return(int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    static int fibo(int n){
        //base condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
