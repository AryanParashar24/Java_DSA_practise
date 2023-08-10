import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        System.out.println(count(40405));
    }

    static int count(int n){
        return digit(n, 0);
    }
    /*
    In the code we will see that the line16 is being hit only once in the whole time rest as soon as hte 0 isn't founded the function will pass on to the line22 then to
    16 and then to line 19 directly and nt reaching ou to the line 17 in the code as soon as the 0is founded instead the next recursion part is jumped to and count is increased
    and then later hte function is called to the line 17 only after hte function is finished that is the number is being converted top 0 and then returned to the function wht
    is the true value of the count and the function is finished and so is the problem/ code.
     */
    private static int digit(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return digit(n/10, c+1);
        }
        return digit(n /10, c);
    }
}
