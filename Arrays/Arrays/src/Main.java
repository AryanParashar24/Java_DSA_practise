public class Main {

    public static void main(String[] args) {

    /* Syntex:-

    datatype[] variable_name = new datatype[size];
    store 5 roll no.
     */

//    int[] rnos = new int[5];  //left hand thing is reference variable and rigth hand side is object
//    // or directly
//    int[]rno2 = {23,45,23,36,46}; //this data type for example int in the staring tells what kind of string data type is stored in the array and all the type of data in an array should be same so if we are making an array of string then all the inputs in it shoudl be string if int then all should be int
//}
        int[] rnos;// Declaration of array here rnos is getting defined to the stuff
        rnos = new int[5]; //Initialisation:  Here the object is being created in the HEAP memory

       /*Here int in the left is the declaration and rnos is reference variable and new int[] is the size of the array
     u can't made an array without confirming the size of an array even if we dont know the size we may input VarArg but we have to confirm wht we know abt
    the sie of the array ,-> it is actually creating the object in the heap memory.

     The declaration and initialisation occurs during the compile time and the creating the object in heap memory occurs during the run time


      So in c language what happens is that we have certain many cells in our ram for example so the data in the array will be stored into those cells of ram but those
    data in the array are stored continously into those cells not at random in c language

    While onto the another hand in Java in isn't this way it isn't necessary to store these data in the continous cells in the array.

    1)--> Array objects are in heap
    2)-->heap objects are not continous
    3)-->The Heap is the run time data area from which the memory for all the classes and all the arrays are allocated------->>> DYNAMIC MEMORY ALLOCATION<<<--Creating memory and array in the HEAP memory
     //Hnece it totally depends on JVM in Java wheather the array is continousor not so array may nbot be continous although it is the defination of arraythat it is a continous collection of data


                 Primitves are stored in the stack memory only like int,char,string,etc but all the other objects like string type ,array type are stored in the heap memory.laso primitves cannot be broken down uinto the shorter datatype
                   new is used everywhere we saw in Java it is basically used to create an object
*/

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}