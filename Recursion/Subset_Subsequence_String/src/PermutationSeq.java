import java.util.ArrayList;

public class PermutationSeq {

    public static void main(String[] args) {
        permutations("", "abc");
//        permutationList("", "abc");
        System.out.println(permutationsCount("", "abc"));
        ArrayList<String> ans =  permutationList("", "abc");
        System.out.println(ans);
    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            permutations(f+ch+s, up.substring(1));
        }
    }

    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            count = count + permutationsCount(f+ch+s, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        //local to this call and it is the origin list whihc is keep getting updated as it is moving on to the next level of recrusion
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f+ch+s, up.substring(1)));

        }
        return ans;
    }
}
