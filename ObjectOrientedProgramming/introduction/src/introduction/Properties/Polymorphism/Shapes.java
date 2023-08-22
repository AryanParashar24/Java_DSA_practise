package introduction.Properties.Polymorphism;

public class Shapes {
//    final void area(){
    void area(){
        // Now here in this code if the final word is added in the code then the override function can't be called as the overriding
        // is stopped if the final keyword is added
        //We can also prevent inheritance in the code by using this in place whiel announcing for the base class for the hierarchy tree in "public class Box"

        // If we write final keyword what Java compiler can copy the byte code of the subroutine directly with the compile code of the calling
        // method eliminating the overhead associated with this method which one to resolve so that extra step is being gone

        //                $$ IMPORTANT $$
        // Dynamic method  Dispatch which ahppends when the whole code is running at teh run time at that time the override function determines
        // which function to run and thus it is also known as the "LATE BINDING"

        // HOWEVER, the final method cannot happen at runtime and can be resolved at compile time opnly as it handling only for one
        // thatswhy thats also known as the "EARLY BINDING"

        System.out.println("area of the Circle is dependent on the sahpes which is being taken");
    }
}
