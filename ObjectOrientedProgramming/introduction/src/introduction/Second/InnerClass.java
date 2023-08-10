package introduction.Second;


// ALSO ONE OF THE MAIN THING IS THAT THE OBJECTS ARE CREATED WHILE THE COMPILE TIME THUS THE STATIC VARIABELS ARE BEEN SOLVED OR READ DURING THE COMPILE TIME


// also we already talked in the System.out.println out is an instance variable of the PrintStream class and this dot(.) is used for binding the instance methods and instance variables with the reference variables, PrintStream might be having a println method whcih refers to its own method and the println always calculates the values of it which then calls the .toString method
// Arrays.toString will run and have the .toString method in it


//class Test{
//    //Here the static present in the function si letting the function to run smoothly otherwise if the static wouldn't ve been present then
//    // would ve given error as the class below is
//    static String name;
//    public Test(String name){
//        InnerClass.Test.name = name;
//    }
//    // We will have to craete a seperate function outside the InnerClass class or make the Test class as static in the InnerClass function itself as in the main fucntion when the Test class will be dependent on
//    // InnerClass class and to run the main function it will need the InnerClass class to have an object or an instance but since it dosen't have
//    // it so it will give an error
//}
public class InnerClass {
    static class Test{
        //Here the static present in the function si letting the function to run smoothly otherwise if the static wouldn't ve been present then
        // would ve given error as the class below is
        static String name;
        public Test(String name){
            Test.name = name;
        }
        // We will have to craete a seperate function outside the InnerClass class or make the Test class as static in the InnerClass function
        // itself as in the main fucntion when the Test class will be dependent on
        // InnerClass class and to run the main function it will need the InnerClass class to have an object or an instance but since it dosen't have
        // it so it will give an error
    }


    /*
    Here we meant that the static doesn't depend on the instance or the objects but if we seperate teh Test class then it will giev the result as Arya and Arya in the output
     but when we included them in the InnerClass function then it will give Aryan and Ary as the result as

     We already know that well the static is used then we dont need any object or any instance to be used in the class or in the function so following that one may ask the
     Test class is using the objects given in the main function as a and b but:------

     The Test will not be using the instances of the InenrClass but the main and the Test class can interact and use the instances been stored in em thus the Test class
     is using the instances or the objects been stored in the main function
     */


    public static void main(String[] args) {
        Test a = new Test("Aryan");
        Test b = new Test("Arya");

        System.out.println(a.name);
        System.out.println(b.name);
         /*Here firstly the a.name will set to Aryan which then refers to the static varible which gives the Test.name to ARyan but then
         afterwards in the second line the static variable will change to Arya in the second line and then the same Test.name will change to
        Arya and thus the Test.name is changed to Arya and thus both theh println statements will change to Arya and Arya will be printed 2times          */



    }
}
