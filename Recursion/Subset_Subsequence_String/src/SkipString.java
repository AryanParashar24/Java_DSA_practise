public class SkipString {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip1("baccad"));
        System.out.println(skipApple("bacchappleghs"));
        System.out.println(skipAppNotApple("vcappjh"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //subsstring is nothiung bt it just craetes a new object and removes the new or the written index from the string
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip1(up.substring(1));
        }else{
            return ch + skip1(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(5));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}