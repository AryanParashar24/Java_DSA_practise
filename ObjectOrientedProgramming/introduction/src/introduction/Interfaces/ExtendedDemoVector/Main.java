package introduction.Interfaces.ExtendedDemoVector;

public class Main implements A, B {

//    @Override
//    public void fun() {       Now here since the fun is being used twice in the code and the default method is being used in two classes thus it
                                //    will give an error, the primary motive of using the default is to expand the interfaces without breakign the code
//    }

    @Override
    public void greet() {
                                //IF A METHOD IS PROTECTED IN A CLASS THEN THE OVERRIDDEN METHOD SHOULD HAVE SOMETHING EVEN BETTER THAN PROTECTED
                                        // NOTHING WORST THAN IT LIEK FOR PROTECTED BETTER ONE IS PUBLIC AND THE PRIVATE IS THE WORST
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
