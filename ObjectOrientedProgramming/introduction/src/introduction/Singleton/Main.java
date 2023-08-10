package introduction.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all three refernce variables are reffering to just one object
    }
}
