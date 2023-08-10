import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
//        subset("", "abcd");
        System.out.println(subseq("", "abcdef"));
    }

    //Many many refernece variables ar pointing to the same object when it is immutable
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p + ch, up.substring(1));
        subset(p , up.substring(1));
        /*but here in the above functioni by the last calls given toth efunction it is creating the new objects
        That is why its having new objects as its creating new new objects
        */
    }

    //Here in htis code we will be creating an ArrayList and passingit in to the body of the fucntion
    //intriducing the ArrayList in the argument of the function is a lot easy as it will be containing a lot more refernce variables & single object
    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            //It is done in order to initialise a list and then fill the answer we got in the end to get filled in the list
            // In the end only on e object will remian and thius the List is made in this condition when the list gets empty which is actually another answer as well amongst all others
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseq(p + ch, up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));

        //Now after getting the answers form the left and the right so now the resut of the additon of the left and the right ones will be returned
        left.addAll(right);
        return left;
        //Now since the list is been made in the body of the function thus the list made will be locally for this function only and
        //whenever the recursion calls are given to the program then the list so produced in each recursion will be taken back with the call going back to the main function
    }
}
