public class StackOverflow {

    public static void main(String[] args) {
        infinite(5);
    }
 // Here comes the concept behind n-- and --n where in n-- the value of 5 is passed first in the function and then after
    //its completed then onlt the n-1 value is passed in the function and since the value of n = 5 is passed in the function thatswhy
    //it keep on repeating and passing 5 only in the function.
    static void infinite(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        infinite(n--);   will give the infinete loop if u run it
        infinite(--n);
    }
}
