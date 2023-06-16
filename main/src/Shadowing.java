

                          //Shadowing in JAVA is the practise of using two variables of same name within the scope that overlapse

public class Shadowing {
    static int x = 70;  // this will be shadowed at the line 8

    public static void main(String[] args) {
        System.out.println(x);//70
        int x = 40;  // The class variable at line 4 is shadowed by this

        /*      int x ;      <<-----This is knwon as declaring
                x = 40;      <<-----this is knwon as initialising

                The shadowing of this does not begin where this local variable is declared it is only done when this local variable i being declared
                So if we try to ask for the print of the value just after the declaration and before the initialising it wont't give any kind of the output.
         */
        System.out.println(x);//40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
