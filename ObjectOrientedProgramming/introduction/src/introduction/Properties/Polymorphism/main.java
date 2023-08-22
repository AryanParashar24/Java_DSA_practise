package introduction.Properties.Polymorphism;

public class main {

    public static void main(String[] args) {

        Shapes square = new Square();
//        Shapes triangle = new Triangle();
//        Shapes circle = new Circle();
//        Shapes shapes = new Shapes();

        // So here as we know we might have writtten in the refernce or in the left hand side of the above code as Circle, Triangle, Shapes bt
        // if we have taken the base class as well then too the choice to be done of which method to be called is being done from the object type
        // of the code and which is quiet different from the general method but to justify we can say that all the things like argument or any other
        // fields choose depends on the refernce type which is the base type but the choice of which method to be called is done by the
        // object class. So the method has to be present in the parent class as well and then the overriden will function finally in the child classes



        //THis is called as UpCasting but now the main question arise is how does the Java came to determine which one would be overriden or not or runned

                                                                    //$$$$$$IMPORTANT $$$$$$$

        //Java came to know it by the process known as ** Dynamic Method Dispatch ** which his nothing but just a mechanism by which a call to an
        // overriden method is runned at runtime time rather than at run time

        // Super class can refer to the subclass object and when the overriden method is called through the superclass method then Java
        // determines to call which version of that method to call through the object at the time this happens hence this determination is done at run time




        // Also it is importanat to be having ht e sharing method to be present in the refernce or the base class as well otherwise overriding
        // won't be abl;e to take place as the overriding is done by the child classes over the base classes and that wouldn't be possible if the
        // method itself isn't available in the refernce varibale itself

        square.area();// Over here the overriding will be for the square as the square.area is mentioned
//        triangle.area();// Over here the overriding will be for the triangle as the square.area is mentioned
//        circle.area();// Over here the overriding will be for the circle as the square.area is mentioned

        // Sop the overridiong is done as according to the class which has been mentioned in the file liek square and circle in the file and it
        // won't be possible for triangle if we would try as we have commented it out and would give error if we would try it out in triangle
    }
}

