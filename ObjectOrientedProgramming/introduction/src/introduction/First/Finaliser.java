package introduction.First;


/*                                 Garbage-Collection & FINALIZER

     Ok so in JAVA as every opther language whenever the value which the referbce variable is pointing to changed then the older one which was
      being reffered by the variable is deleated, the on lty difference is that in JAVA this function is perfoprmed automaticaally while in the
       other languegaes it is done manually and u can't control it manually when to do it or something in JAVA but,
we can use FINALISER to print something or command the program to output something when the garbage collection process is being done automatically
 */

public class Finaliser {
    public static void main(String[] args) {
        AP aryan = new AP("Aryan");

        AP obj;
        for (int i = 0; i < 100000000; i++) { // So many objects is being called as for the small number it isn't possible to call garbage colector
            obj = new AP("wow");
        }
    }

}

class AP{
    final int num = 10;
    String name;

    public AP(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
