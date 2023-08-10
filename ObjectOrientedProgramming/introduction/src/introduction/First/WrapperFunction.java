package introduction.First;

public class WrapperFunction {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        "Integer." like if we would use Integer instead of just using like "a." then it won't provide much of the functionalities oin the code to peform as
       // When we used Integer then it will now make a whole object not primitives bt the Objects and objects as said in th class, class is a collection of functions

        Integer a = 10;
        Integer b = 20;
        swap(a, b);
       /* Here in this code e know tht it will not swap it as in java there is nothing like pass by refernce there is only pass by value and thus in primitives pass by
         value is just a value so pointer to it a and b as defined above in the main function won't be the same ones in the swap function below the swapping will be done
         of the values present in the scope of the swap function but not with the values been provided in hte main function as they aren't same.


         But if would pass by passing the reference Variables as by introducing Integer in the argument in the function then also it won't swap the variables in the function
          as in the code refernce variavbles we used as INTEGER is a final data type which means once initialized it can't be changed or swapped as in our case

                                    FINAL reference variable in the code needs to be initialized first as they can't change later once these are initialized as:-
         */

        final int NUM = 20;  // also the final data type needs to be kept in the capital letters
//        NUM = =30;   here in this case we will find an error as the final data type can't be changed

        //                   Also the FINAL data type in the code is need to be initialized with the primitve data types not with the reference types as with the
        // reference types the datatypoe will be fixed and won't be possible to change tor be taken by other bvaribale but also the object will change its value


        /*
        Also if the final si been wirtten with the prinitve data ttype then we can't change aything in it but if it is used with the refernce value liek lets say
         */
        final Student mukesh = new Student();
        mukesh.names = "mahesh";
        System.out.println(mukesh.names);
        // Here it will run as with the primitve data type if we used final then it will nt change it but if we used refernce varibale instead of i tin this place
        // then it will be able to change the data in it but not allow to change the vlaeu to like mukesh = other object;


        System.out.println(a + " " + b);

        final A aryan = new A("Aryan");
        aryan.name = "new-name";
        System.out.println(aryan.name); // here it will run the code successfully but not as

    //                      when a non primitve is final, you cannot reassign it.
//        aryan = new A("newobject"); not possible as
    }
    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
}
