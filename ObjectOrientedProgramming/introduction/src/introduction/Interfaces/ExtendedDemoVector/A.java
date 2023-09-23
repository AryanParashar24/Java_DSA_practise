package introduction.Interfaces.ExtendedDemoVector;

public interface A {

    //static method interfaces should always have a body as static methods aren't dependednt on the objects and thus they always required to have a body
    //sattic methods are called by the interfaces name
    static void greeting(){

    }
    default void fun(){
        System.out.println("It is fun in A");//the primary motivation of this default method was to provide a means the interfaces could be expanded without
                                // breaking the existing code
    }                           // also the classes implementation will be priority over a default method
}
