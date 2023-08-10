public class NoOfSteps {
    /*
    In this code we have to count the number of steps involved in the code to return to 0 for the number and if the number is even divide it by 2
    and if it is odd subtract by 1 and get the number of steps involved in the code to return to 0
     */

    public static void main(String[] args) {
    }

    public int numberOfSteps(int num){
        return helper(num, 0);
    }
    private int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if( num % 2 == 0){
            return helper(num /2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}
