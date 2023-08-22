package introduction.Properties.Inheritance;

/* Inheritance is anything that has been passed on from the base class to the child class saem as by parents there are certain factors
and resources been passed to the children like the money gens, etx similarly

In programming the inheritance is the passing of the field being described and established in the base class(parent's class) to the
 child class by which those classes would be available for the child class from the base class but also they can make their own
 fields which wouldn't be available for the parent's or the base class

 These properties from the base class are exercised to the child class by extense keyword
 */

/*
child class would be able to excess the properties from the base class but also while defining for the child class it is considered to
 describe the preperties of the base class as the values of all those properties would be different for each of them
 */

//public final class Box {
    // Thi final keyword being used here in this would restrict Inheritance to get more insights of this final keyword please divert to
    // "introduction.Polymorphism.Shapes"
public class Box{

    // Now here we have announced it to be private for l in this class but earlier it wasn't so to understand the concept refer to main and BoxWeigth class in the directopry
    double l;
    double w;
    double h;
    double weight;
    double side;

    static void greetings(){
        System.out.println("hey yo im in Box class. greetings!!");
    }

    Box(){
        this.l = 11;
        this.w = 11;
        this.h = 11;
        this.weight = 71;
    }

    public double getL() {   // Here we are using it using the getter method but if e move in top the files and stuff we will fin d it is private
        // method but in the main function we will be using it through the refernce through it
        return l;
    }

    //cube
    Box(double side){

        super();
        //here we have initialised a super here but even this too didn't produced any changes or any errors as even the class which is the highest base in the tally of
        // classes it will still be refering/calling or pointing to the "Object" class which is the highest class in this tree


        //EVERY SINGLE CLASS INHERATES THE OBJECT CLASS

        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
