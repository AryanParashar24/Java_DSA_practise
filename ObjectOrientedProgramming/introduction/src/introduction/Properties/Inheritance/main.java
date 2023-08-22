package introduction.Properties.Inheritance;

public class main {
    public static void main(String[] args) {
        Box box = new Box();
//        Box box = new Box(2);
//        Box box = new Box(1, 3, 6);
//        Box box = new Box(new Box());

        /* Here in this function we will be calling the another class from the same package and when we will be printign the content as per the function then the fucntion
         will be printed as per the content in the class as if the class we filled is empty then the class from the Box class will be accessed which is empty bt if there
         are 3 entries then the cube class of the boc will be accessed as per the fillign and if some other funcion is filled then that function will be called which is
         storing for some other function
         */

//        System.out.println(box.l + " " +  box.w + " " +  box.h);

        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(2, 3, 4, 18);
        Box box7 = new BoxWeight();

        box2.getL();// Here we are able to use it through tht e refernce of the fucntion in the Box class even though it is a private method


        Box box5 = new BoxWeight(2, 3, 4, 11);
//        System.out.println(box.weight);
        // So here as we can see that the child class's properties can't be accessed from the parent's class but now if we try to refer child's class from parent's class
        System.out.println(box5);
        // here in the command Box box5 = new boxWeight(2,3,4,11) the refernce variable box5 is present in the stack memory which is pointing to the heap memory's
        // object BoxWeight & thus the information/properties of Box will be available to use for box5 along with its own properties which its usign like weigth from BoxWeigth


        // $$ WHAT IS ACCESSED IS BASED ON THE REFERENCE TYPES AND NOT ON THE BASE TYPE

        // $$ WHEN A REFERNCE OF A SUBCLASS OBJECT IS BEEN ASSIGNED TO THE SUPER CLASS REFERNCE VARIABLE LIKE IN THIS EXAMPLE THEN THEY WILL ONLY HAVE ACCESS TO THOSE PARTS OF THE OBJECT THAT ARE DEFINED IN THE SUPER CLASS


        /*Now here when we will be announcing the l to be private we will see that we can just use private l inthe same file or the class we have been
         using it and initialised it but not in other classes like in this main or in BoxWeight so only the file containign that private property will be able to use it

         Other then that in BoxWeight we can see that we would be able to initialise and use l as well in that by using the super btu we aren't
         using it in it but it is just using the Box fucntion from the Box class.
         */
        System.out.println(box7.w + " " + box7.weight);

        System.out.println(box5.w + " " + box5.weight);

//        Box.greetings();// here we could have runnned a static with the refernce variable as well but it is recommended to run a static with
        // the Class name instead

        Box box101 = new BoxWeight();
        box101.greetings(); // Her in this we will see that the result we get us the greetings class form the Box class i.e. the Base class and
        // not from the child class because--

        // Here we know that the static will not be inheriting but lets say if these static were inheriting then inheriting from the child class
        // will be of no use because the methdo from the parent class will always run no matter from which object you are calling it as it is
        // static that's the reason static from the main class or the Base class is being called even if we would remove the static greeting
        // class form the child class as well, then too the saem result would be obtained asw ell.

        // $$ STATIC METHODS CAN BE INHERITED BUT CAN'T BE OVERRIDEN, even if we would be calling it from the child class instead of from
        // the base class as --

        BoxWeight box201 = new BoxWeight();
        box201.greetings();// here als othe same result would be obtained as teh static can't be overriden and the one from the main or
        // the base class would be read and returned
        // So the thing is --

        // OVERRIDING DEPENDS ON OBJECTS BUT STATIC DOES NOT DEPENDS ON OBJECTS. HENCE, STATIC ONES CAN'T BE OVERRIDEN




        /* $$$$$$$$  IMPORTANT why can't we have a child refering to the parent refernce variable

        there are many variables inboth parent and child classes
        you are gievn access to variables taht are in the ref type i.e. BoxWeight
        hence, you should have access to weight variable
        this also means, that the ones you are tying to access should be initialised
        but here, when the obj itself is of type parent class, how will you call the constructor of child class
        Thatswhy it is giving error
         */
//        BoxWeight box6 = new Bos(2, 3, 4, 11);
//        System.out.println(box6);


        BoxCost box11 = new BoxCost(12, 11, 101);
        System.out.println("side = " + box11.side + " weight = " + box11.weight + " cost = " + box11.cost );
    }
}
