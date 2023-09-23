       //Fibonacci as we did earlieris the sum of the previous two nymbers

       //So whenever we wrote the Recursion  in the formula then it is called as the Recurrence Realtion


       /*When do we know that we can use Recursion at a problem:--
          1)) So whenever we are able to break a problem into the simpler units or values then at that possition we can use recursion over there
          2)) Also at the base condition, we know the base or the starting values like in this case of fibonacci numbers we know that F(0)= 0 & F(1)= 1
       */
public class FibonacciNumber {

    public static void main(String[] args) {
        int ans = fibo(4);  // Is helpfull while debugging it for understanding
        System.out.println(ans);
    }


                                   //MUST MUST MUST USE DEBUGGER TO UNDERSTAND IT BETTER AND GO OUT WITH THE NAVIGATIOSN AND EXPLANATION BEEN NOTED BELOW
    static int fibo(int n){

        //base condition
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);//BUT HERE it isn't TAIL RECURSION -as in tail recursion it is the last function and thus gotnothin <<<------
        //                                        else remianing to do bt here it has to add the last function it need then gives it as answer         |
        //                                                                                                                                             |
                                                    //TAIL RECURSION                                                                                   |
        //the last function call is known as the tail recursion when the f(n-1) and f(n-2) gives the answer then their sumation is the                 |
        //answer and how they get it , its upto them.---------------------------------------------------------------------------------------------------

        //So here first of all the first one that is n-1 whihc is written first will be called and will be solved to break down to the
        // simpler and the smaller units which we know already i.e in the end F(1) will be called and thus 1 will be retruned from it finally

        /*
                   f(4)
                 /     \
               /         \                 So here as we can see the f(n-1) will be slved first as according to this RECURSION TREE and for that when solving up the f(2) we
            f(3)        f(2)               will get  to f(n-1) that is f(1) then f(1) will giev its value back to the f(2) and then when the f(n-1) which was f(1) is done then
          /     \      /     \              f(2) will move to the f(n-2) then and then f(0) which was f(n-2) will give its value to the f(2) and then f(2) will add the value of f(1) and f(0)
        /         \  /         \         and then the value it got will become f(2) which is the second fibanacci number and then same would be proceed to f(3) which chose f(2) over f(1) as
      f(2)       f(1) f(1)       f(0)     due to f(n-1) and then after the f(3) will move to f(n-2) wihch is f(1) and then after adding em up the value fo f(3) will be got which
     /    \         \                       will become the third fibanacci number then in the series and so on to reach out to the final number which is being feeded in the input
    /        \        \                       & then at the end when it will reach out to the value of f(4) which is asked then it will get the number and will [pass it on
  f(1)      f(0)      f(1)                 to main() function.


         Also another point to be noted is that when it is going with the  f(n-1) then only those function which are coming into the tree the branch will be stored in the
         stack and will be removed when done with execution those with f(n-2) will be stored inthe stack memory when their chance will come after the completion of the f(n-1)




                                                         HOW TO UNDERSTAND AND APPROACH A QUESTION IN RECURSION

                     1)) Identify if u can break down the question in the simpler and smaller units
                     2)) Write the recursion relation if needed
                     3)) Draw the recursion Tree
                     4)) ABOUT THE TREE--
                        a)) See the flow of function and how they are getting in stack
                        b)) Identify and focus on left tree calls and right tree calls (THis just means that untill and unless the left side of tree isn't solved the right side isn't even get considered at first)
                        c)) Draw the tree and pointer again and again using pen and paper
                        d)) Use a debugger to see the flow
                     5)) See how the values & what type of values(data type) are returned at each step . See where the function call will come out. In the end you will come out of the main function



                         TYPES OF RECURRENCE RELATIONS:--

                 1)) Linear Recurrence relation ---> Fibonacci examaple as we took here
                 2)) Divide & Conqurrence relation ----> Binary Search
                                                         It meant by the time taken in it would be a constant time for comaprision and then time taken and dividing in half as:--
                                                         = O(n) + f(N/2)  So here as will do comparision adn then the addition for the time taken for half the array from the chhoosen side


                          Variables of RECURSION:--

                  1)) Arguments
                  2)) Return Type
                  3)) Body of function


                  Always make sure to return the result of a function call of the return type .

         */

    }
}
