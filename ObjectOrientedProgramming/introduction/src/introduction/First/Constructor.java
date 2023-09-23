package introduction.First;

                   /*                                                  IMP. Points

                                                                 DYNAMIC MEMORY ALLOCATION

                         So lets say our code
                                                       Student student1 = new Student();
 Then the left side of this code takes place while the compile time and the right side of the code usually happens during the runtime and thus
  the memory by the new keyword is being allocated during the running time when the compilation is done and finished and that memory allocation
   is known as the DYNAMIC MEMORY ALLOCATION

                                                  ALL CLASS'S OBJECTS MUST BE ALLOCATED DYNAMICALLY IN JAVA (for reasons look below)


Now another quetion we may ask is why dont we use the "new" keyword while writing for the primitive data type as the primitve data type aren't implemnted as
objects in python and they are represented as primitve data type only and thus they are only stored in the stack memory . In JAVA thi srule is been set whci isn't the case
for the PYTHON  as every datat in python is stored in the heap memory, JAVA use this to seperate the big data to increase the efficiency whihc increase its speed
 and therefore PYTHON is comparatively slower than JAVA
                    */

public class Constructor {
    public static void main(String[] args) {
        //to crate a document for storing 5 roll numbers
        int[] roll_no = new int[5];

        //for storing names
        String[] names = new String[5];

        //for storing marks
        float[] marks = new float[5];

        /* But now if we wish to store & combine these all input in single entity it is known as CLasses.

        Classes are the named group of properties and functions
        Classes are the templetes of the objects and Objects are the instance of a class

        Like Classes are like the logical construct which does not really exist in real world or occupy space
        While the objects which are the Physical reality which occupy space in the memory based on the instructions and logical constricts
        defined by the Classes
        So class is a template of an object, which is an instance of a class. Class create data type which helps in creating objects
        when objects are declared then they create instance of a class
        */

        Student[] students = new Student[5];
        //Here this new in the above line is used to careet new objects

        //Here we are just declaring the reference variable to this Student data type and is not refering to anything at the moment
        // and is just present in the stack memory
//        Student Aryan;

//        System.out.println(Arrays.toString(students));
        //Here if we run the code will give null as if the program or the class isn't declared yet then it will give null



         /*Here in this the new will dynamically allocates the memory at the runtime and returns a reference to it in the heap memory with the memory address stored with the
         object and pointed towards the object in the heap memory and same would have been Student2 as well which would have been stored in the stack memory pointing to its own object
        in the heap memory with the help of the dynamically memory allocated with the object by the new keyword */

//        Student Aryan;
//        Aryan = new Student();
//              OR ELSE WE MAY WRITE
        Student Aryan = new Student("Janu", 5, 100);
//        Aryan.roll_no = 2;             // Here its a very tedious work as we have to repeat the name of the refernce variable again and again
//        Aryan.names = "Aryan parashar";  // So to reduce it we will be generating object s in the constructor of the fucntion which is the Stduent()
//        Aryan.marks = 68;

        // Now we want to bind these arguments as provided in the constructor with the objects to reduce these repetitive factor in the code So


        /*     CONSTRUCTOR is a function which runs when you create an object and it allcoates some variable.
            If nothing is provided in the constructor then JAVA will call its own constructor and keep it empty untill anything is been filled in it
         */

        Student random = new Student(Aryan);
        Student random2 = new Student();
        /*Here in this case the right side of hte above code as new Student() is creating a nwe object and inside the CONSTRUCTOR random2 is replaced with Student in the code
         above as random2 is just a refernce variable which is going to call the Student(){ this("", , )} whihc is used to call the below Student() class with the three
         arguments in it which isn't empty as u can't call random() as in the code itself as the random2 is a refernce variable*/
        System.out.println(random2.names);


        System.out.println(Aryan.roll_no);  // Will give 0 if we didn't introduced anything in this object
        System.out.println(Aryan.names);//will igve nulla s the name
        System.out.println(Aryan.marks);

        Aryan.changeName("Aryan");
        Aryan.greeting();
        /*Thats how it works here in java and thus all class's objects must be allocated dynamically in JAVA

           So in this way in the stack memory a refernce value is been stored instead of storing a real obejct as the real object of the class is stopred in the heap memory
           this refernce in the stack memory is just having a dynamically memory allocation referring to the original value in the HEAP memory as in JAVA it  isn't allowed for us
           get the memory location of any object

           Hence you cannot cause an object refernce to point to an arbitary memory location or manupulate it liek we did in C language
         */
    }

    //create a class

}

    //Instance Variables are the variables within the classes
    //now here we will be using the Dot operator which is uesd to link the instance variable with the object as liek Student1.roll_no (Student1 is the name of the first object)



