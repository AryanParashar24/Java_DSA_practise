public class StringbuilderSB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+ i);
            builder.append(ch);
        }
        System.out.println(builder.toString());//So here it is just adding up new object into the original one like array
        //So it isn't immutable it  is mutable
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
