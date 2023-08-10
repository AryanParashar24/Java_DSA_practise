package introduction.Second;
// her in this the packag ewe use the path of this file is been introduced it is same as in the path pof the windows
// but have . instead of / in the exit of on eof the directory

import introduction.First.Student;
//here in this specify the path of the function we used in the code which is present in the package of the directory of which the
// Second is part of and here also the . approach for the path is been used
import org.w3c.dom.ls.LSOutput;

public class DataStorage {

    /*                                WHY DO WE USE "static" in the public static void main

It is because the sttaic allows us to run hte fucntion even when no object has been created in the code. So thatswhy the static
 function aren't dependent on the objects but on the class in which they are defined like in the main function in this case
     */

    public static void main(String[] args) {
        Human Aryan = new Human("Aryan", 20, true);
        Human Antriksh = new Human("Antriksh", 18, false);
        //We don't need to specify the path of the files present in the same package as the Human class or the file is present in
        // the same package Second

        Student Ajay = new Student("Ajay", 21, 89);

//        System.out.println(Aryan.population);
//        System.out.println(Antriksh.population);
        //Here it will work in the same way if we use with any object name but normally for any static avriable
        // we use the class name like

        System.out.println(Human.population);


        // Now here if we just call the greeting function when the static isn't included while defining the function then
        // an error is found as the static function can only call the functions which are static itself


//        greeting();
        //if the static isn't provided in the function then we can't use it because thsi requires an instance to
        // depend upon but if we provided in hte static function as in the psvm then how can we call some function which depends
        // on some instance from the function which dosen't depends on any instance

        DataStorage funn  =new DataStorage();
        funn.fun();
//        greeting();
    }
//     Here as according to the function u can't call a function whihc is dependent onto someother instances bt bt inside a void
//     function which depends on some other object or instance a static funtion can be called without giving any error
    static void fun(){

        DataStorage funn  =new DataStorage();
        funn.greeting();
    }

     void greeting(){
        System.out.println("Whaasup World");
    }
}
