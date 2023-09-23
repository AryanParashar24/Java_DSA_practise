package introduction.Interfaces.nested;

public class A {
    //nested interface
    public interface NestedInterface{

        //OK SO THE ONLY DIFFERENCE OF THE NESTED LEVEL INTERFACE FROM THE TOP LEVEL INTERFACE IS THAT IT CAN BE DECLARED AS THE PUBLIC PRIVATE R PROTECTED WHILE ON THE OTHER HAND THE TOP LEVEL INTERFACE HAS TO DECLARED AS THE PUBLIC OR DEFAULT
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{   //A.NestedInterface means taht inside A there is a NestedInterface
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
