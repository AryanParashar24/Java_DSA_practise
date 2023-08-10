import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        LetterCombination("", "12");
        ArrayList<String> ans = padList("", "12");
        System.out.println(ans);
        System.out.println(padCount("", "12"));
    }

    static void LetterCombination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        //Here it is used to convert a number representing a digit to its corresponding integer value.
        int digit = up.charAt(0)-'0';//this will convert '2' to 2

        //this was considered to take the interval for each digit taken and then converted to digits as according tto the ascii code
        //where the interval will have its first element from (digit-1)*3 till digit*3 where digit*3 isn't included in the range
        for (int i = (digit-1)*3; i < digit*3; i++) {

            //here the i in the recursion in that turn will be added with value of a in code in order to get the char value of ch
            char ch = (char)(i + 'a');
            LetterCombination(p+ch, up.substring(1));
        }
    }

    //try out the ArrayList method urself first
    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0)-'0';

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)(i + 'a');

            ans.addAll(padList(p+ch, up.substring(1)));

        }
        return ans;
    }

    static int padCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        int count = 0;
        int digits = up.charAt(0)-'0';

        for (int i = (digits-1)*3; i < digits*3; i++) {
            char ch = (char)('a' + i);
            count = count + padCount(p+ch, up.substring(1));
        }
        return count;
    }
}