package introduction.First;

// Here it is desciption of the class kind of liek the rule book whose changes and modifications will apply to the whole class as well
public class Student {
    //data-type for every single data type
    int roll_no;
    String names;
    float marks;

    //Here in this now if we want to pass some values for the object in the class then
    // we can do it by the keyword this
//    Student() {
//        this.roll_no = 2;
//        this.names = "Aryan Parashar";
//        this.marks = 66;
//        // and also if we would have instead of aryan call some other object afte raryan in the class as rohit then all these values for the object in the class will be
//        // applicable for the rohit and if lets say we inroduced some other function as well as :-
//    }

    Student() {
        //Here this will be calling Student class below --> the non empty one which is having three arguments stored in it
        //Internally it is something liek Student("Mohit", 11, 89)
        this("Mohit", 11, 89);
    }

    //So here if i wants to change the values of the objects in the class then i can do it by assuring and passing out all the arguments in the function and the call
    // is already taking place in the main code for the rule code/class

    //here it will be passed for arpit
//    Student arpit = new Student("Arpit", 12, 54);
    public Student(String naam, int r_no, float marks) {

        //Specifically in it we will have to call by simple names and types we passed in the argumenst bt if we refered by the same name as in the call
        // then we will have to call by using "this" keyword as the compiler might get confuse that which name or the data type u r referring to the
        // one passed in the current function or the one been defined before
        names = naam;
        roll_no = r_no;
        this.marks = marks;
    }

    Student(Student other) {

        //Here in this code the this will be replaced with random fromthe function call above student random = new Student(Aryan) and the other in the code below would
        // be replaced by the Aryan in the code below
        this.names = other.names;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }


    /*
    here in the above we provided two Students class and both of them might represent or looks or functions to be a buit similiar in this situation bt r different as
    in the one with 3 argumenst it will be called by the one which is also calling in the main fucntion with 3 argumenst bt if we introduce a new objet named "Student"
    in the main function then the fucntion will then call the empty class Student() in the code bt if we delete the empty Student() then it will give an error then
     */


    void greeting() {
        System.out.println("Hello my name is " + names);
        System.out.println("Hello my name is " + this.names);
    }

    // Also here if we would try to change the name from the main functionwe can do it by calling the function
    void changeName(String naam) {
        names = naam;
    }
}
