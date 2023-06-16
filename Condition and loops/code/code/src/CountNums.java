public class CountNums {
    public static void main(String[] args) {
        int n = 232524;

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem ==2) {
                count++;
            }
            n = n / 10; // n /= 10
        }
        System.out.println(count);
    }
}
/* it is just kin of dividing the term or n and then getting out he remainder out of the n then it is just gettingit divided it agimn so as to again
find out the  number of the numbre of the particular digit in the number
 */