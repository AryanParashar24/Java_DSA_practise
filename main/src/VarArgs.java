
//Variable Length Arguments  is used when we don't  know how many inputs we are giving

import java.lang.reflect.Array;
import java.util.Arrays;
  public class VarArgs {
    public static void main(String[] args) {
        //  fun(3,56,3453,34,76,3,65,56,7);       //So here  it will arrange these integers into the form of array
                                                    //If we would left it nothing in the box then also it will still run  and will give an empty array
          multiple(34,56,"Aryan","Aditya","Suraj","Shashank");
          demo(45,67,234);
    }

    static void demo(int...v){

        System.out.println(Arrays.toString(v));
    }
                        // Now here if the funtion is left empty then it now give an error and it is called as the
                       //AMBIGUITY as we didn't made any hints to which function we actually refering to and thus it is giving an error
    static void demo(String...v){

        System.out.println(Arrays .toString(v));
    }

      static void multiple(int a, int b, String...v){         //Specifies ad the first two ones are integers and then exist string data type

    //static void fun(int...v){                          //Here it totally depends upon us wheather we want to put integer or char or any other kind
        System.out.println(Arrays.toString(v));                      //of string into array.
    }
  }
