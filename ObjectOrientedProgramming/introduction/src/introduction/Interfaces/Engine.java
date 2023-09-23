package introduction.Interfaces;

/*
 SO the multiple inheritance is not allowed in java so to tackle with that situation we use Interfaces which are stored with the java extension
 file, now how the interfaces are different than the classes-

            Interfaces are the ones having the abstarct classes in em and can't have objects of the classes
            So in abstract classes we can't have objects of classes and we can't have static abstract class as abstract cl;asses are formed so
            that they can be overriden by the base classes by the parent classes btu we can't do it in static classes.

       So we have got that we can't have objects in classes and wht are the things in java which aren't dependent on objects are static hence
       in Interfaces functions are public and abstracts and variables are static as they aren't dependednt on the objects as objects aren't
        allowed to exist in classes, and final by default are interfaces


        Interfaces states wht the class is doing other than how it is doing that also
        Class will be storing some stage informations like instance variables and stuff but the abstract classes won't be storing them as it is final and
        thatswhy the variables fall in the static and final, u can't change those adn don't allow to depend on obejcts either

         Interfaces conatins abstract methods while on the other  hand abstract classes contain both abstract and non abstract emthods as well, while the
         abstract classes have variable in the final as well in non-final state as well while in interfaces can contain only the final state variables as
         they can't change as:
         Interfaces can't initialize the constructors and final methods needs to initialize the constructor in order to implement changes
         Also Abstract classes can provide implementation of Interfaces but the Interfaces, can't provide implementation of Abstracts classes

         So Abstract classes can't implement multiple inheritances but in the other hand Interfaces can implement Multiple Inheritances as in
          abstract classses can implement multiple Interfeaces but on the other hand we can't implement multiple inheritances in abstract
           classes whule in the other hand Interfaces have multiple Inheritances, also asbtract classes can have all kind of types as public,
            private, protected and all while on the other hand in Interfaces variables are only allowed as in static and final types

            Interfaces can have multiple implementations of inheritances and tells wht the class is doing inspite of telling how the class is
             doing as the how part is done by the base classes

      SAME AS IN THE ABSTRACT CLASSES WE USE EXTRACTS HERE TO USE INTERFACES WE WILL BE USING IMPLEMENTS
 */

public interface Engine {

    int a = 30;
    static final int PRICE = 45000;

    void start();
    void stop();
    void acc();

}
