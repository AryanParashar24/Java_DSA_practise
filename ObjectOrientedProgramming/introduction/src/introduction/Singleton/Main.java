package introduction.Singleton;

import introduction.acess.AcessModifier;

public class Main {

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all three refernce variables are reffering to just one object
    }

    // Took as an example from the introduction.access.A as for using privatre types in the class A as we used getter and setter in the file
    // which were set to be public for getting and setting of the values
    AcessModifier acessModifier = new AcessModifier(12, "Kunal");
}
