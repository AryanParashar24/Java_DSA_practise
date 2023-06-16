public class Refractor {
    public static void main(String[] args) {
        String name = "Aryan Parashar";
        System.out.println(name);
        String a = new String("Aryan");
        String d = new String("Aryan");
        String b = "Aryan";
        String c = a;
        System.out.println(c);
        System.out.println(a.charAt(0));//internally it sjust converting this string into the array and then performing the same steps as we use to do in the arrays
        System.out.println(c == a);
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == d);//Although the value is same but they may pointing to2 different object sso it will give false as i have explicitely mentioned both of em seperately
        System.out.println(a.equals(b));//here it is use to get the values it is containing are same or not soit dosen't depends on the obj they might be reffereing to

    }



}