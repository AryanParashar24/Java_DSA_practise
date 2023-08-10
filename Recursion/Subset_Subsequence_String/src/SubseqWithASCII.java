import java.util.ArrayList;

public class SubseqWithASCII {
    public static void main(String[] args) {
        char c  = 'a';
        //It will print the subsquence parts of hte character and the word as an integer is also included here in it as a result of which the acii code is printed
        System.out.println(c + 0);
        subseqascii("", "abc");
        subseqASCIIList("", "abc");
    }

    static void subseqascii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqascii(p + ch, up.substring(1));
        subseqascii(p, up.substring(1));
        subseqascii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subseqASCIIList(String p, String up){
        if(up.isEmpty()){
            //It is done in order to initialise a list and then fill the answer we got in the end to get filled in the list
            // In the end only on e object will remian and thius the List is made in this condition when the list gets empty which is actually another answer as well amongst all others
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqASCIIList(p + ch, up.substring(1));
        ArrayList<String> second = subseqASCIIList(p, up.substring(1));
        ArrayList<String> third = subseqASCIIList(p + (ch+0), up.substring(1));


        //Now after getting the answers form the left and the right so now the resut of the additon of the left and the right ones will be returned
        first.addAll(second);
        first.addAll(third);
        return first;
        //Now since the list is been made in the body of the function thus the list made will be locally for this function only and
        //whenever the recursion calls are given to the program then the list so produced in each recursion will be taken back with the call going back to the main function
    }
}
