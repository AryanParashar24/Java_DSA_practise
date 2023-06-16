public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        if( str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() /2; i++) { //normally array.length is actually that length while onto the another hand here str.length is more of method and function
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);  //O(N) is its time space complexity

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
