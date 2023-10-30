package introduction.generics;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); //something that takes an argument in the function
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

        //Here forEach is a Consumer type which is a function used to return nothign thatswhy even in the documentation we will see that it is
        // operated with the void type
//        arr.forEach((item) -> System.out.println(item * 2));//Here item represents every single element in the arrayList like i in this file
        //So here in the left side the arr.forEach((item)) contains the parameters and the System.out.println(item*2) contains the body of the function

        //Now if you want to do it with the Consumer tyeo as well then we can use it in:
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation2 sum = (a, b) -> a+b;
        Operation2 pro = (a, b) -> a*b;
        Operation2 sub = (a, b) -> a-b;

        LambdaFunctions mycalcuylator = new LambdaFunctions();
        System.out.println(mycalcuylator.operate(5, 3, sum));
        System.out.println(mycalcuylator.operate(5, 3, pro));
        System.out.println(mycalcuylator.operate(5, 3, sub));
        /*Ok so here wht is happening here as we command to perform the tasks it is going to the private operate and then the operate is going to the
         Operation type op and then op.operation which is present int he Operation2 which is actually an abstract class and then the abstract class
         will call its use cases which are in the main body whiel defining the structure of adding, product and subtracting
         */
    }

//    int sum(int a, int b){
//        return a + b;
//    }

    private int operate(int a, int b, Operation2 op){
        return op.operation(a, b);
    }
}

interface Operation2{
    int operation(int a, int b);
}
