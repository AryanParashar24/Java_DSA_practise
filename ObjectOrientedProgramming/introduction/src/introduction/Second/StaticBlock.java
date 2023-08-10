package introduction.Second;

public class StaticBlock {
    static int a  = 5;
    static int b = 10;

    // will only run once when the first obj is created i.e when the class is loaded for the first time
    static {
        System.out.println("here's a trick");
        b = a * 5;
    }
    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}

