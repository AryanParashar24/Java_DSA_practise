//  All THE CALL FUNCTIONS ARE STORED IN THE HEAP MEMORY

public class NumbersExample {

    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers: 1 2 3 4 5

        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    static void print5(int n) {
        System.out.println(n);
    }
}

/*
Ok, SO NOW LET'S SEE HOW A FUNCTION IS BEEN CALLED AND HOW IS IT EXECUTED IN ANY LANGUAGE NT ONLY IN RECURSION OR IN JAVA BUT ANY LANGUAGE:--

Ok so whenever a function is :--
1)) While the function is not finished executing it will remain in the stack memory

      It simply means that whenever a function is actually being called then that function is stored in stack memory until it isn't finished executing and is finished so, for example
      in the above example firstly print1 is being called and then that print1 will call print2 and then that print2 will call print3 function and the same goes on and unless and untill
      the last function isn't called and finished executing print1 function which was called in the starting won't get finished executing and similarly neither print2 ,print3,print4

2)) When a function is finished executing , it is removed from stack and then the flow of program is restored to the location where it was called

     It simply mean that whenever the function is finished executing ti will be removed from the stack & restored to the place where it was being called in the starting. For example,
     when the last of lets say print 5 is finished executing then the print5 function will get out of stack as it is done executing and then the print4 function which was responsible
     for calling th print5 function will also get removed output of the stack and so does the print3, print2 and finally print1 function as well.
 */
