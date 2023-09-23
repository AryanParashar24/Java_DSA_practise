package introduction.AbstractDemo;

/*
ok so well in this lecture we will be talking about the multiple inheritance which isn't possible in java as the base class might get confused
 which parent class to refer to. The base classes use the override function to override the methods of the parent class and those functions
  are called the abstract function

  $$ IF TEH PARENT CLASS HAVE EVEN A SINGLE ABSTRACT CLASS THEN THE CLASS HAS TO BE DECLARED ABSTRACT$$
 */

public abstract class Parent {

    //you cannot have a final abstract class as the abstract classes are made to get overriden and changed as well dependign upon the child
    // thatswhy it isn't possible to have a final abstract class
    int age;

    final int VALUE;
    abstract void carrer();
    abstract void parter();

    /* You cannot have create objects of abstract classes, why can't we call objects of abstract classes as if we have an object created of
     abstract class and try to call the child class extended by the parent class and try to call object of it as for the carrer then it
     won't happen as the carrer dosen't have its own body


    $$ Similarly for the same reason you cannot create abstract constructors $$

    QUESTION- Is it possible to create abstract static classes, ??

                  ANSWER- Does static methods been able to override the methods--NO!!, and the abstract methods are use for overriding the
                  methods and thus creating abstract static classes are of no use, but


                                    $$ WE CAN CREATE STATIC CLASSES INS IDE THE ABSTRACT CLASSES!!!! $$
     */
    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("It is all Normal here");
    }
    public Parent(int age){
        this.age = age;
        VALUE = 234542;
    }
}
