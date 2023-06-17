public class SieveOfRithothosis {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
//        System.out.println(primes[0]);
        sieve(n, primes);
    }

    //false in array if the number is prime
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
/*wht is he doing is that he numbers in the series till the number n if there are n numbers then the number isn't
 needed to be checked from each and every number in the series instead just check from the numbers whihc are already prime
      as if something is divisible from 4 then the it would be divisible from 2 as well so instead just check it from 2 and similarly from
      the prime numbers only or just with the starting prime numbers of 1-10


      Or else , just start start from 4 as we know that 2,3 are prime and then after move up to the next number with the formula of i+j where i was the previous number and j is the one started from 4 i.e i*2
      */
        for (int i = 2; i <= n; i++) {
            if (primes[i]){
                System.out.println( i + " ");
            }
        }
    }
}
