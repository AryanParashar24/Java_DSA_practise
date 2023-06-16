public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 324, 2, 6, 7896};
        System.out.println(findNumber(nums));
        System.out.println(digits2(-6544765));
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
       }

       //function to check wheather the number contains even number of digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return(int)(Math.log10(num)) + 1;
    }

    //to count the number of digits of a number
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }

        if (num ==0){
            return 1;
        }
        int count = 0;

        while (num > 0) {
        count++;
        num = num / 10;  //  num/= 10
        }
        return count;
    }
}
