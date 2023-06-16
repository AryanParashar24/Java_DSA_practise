
                      /*
                      RECURSION:--
So actually RECURSION means calling it self to perform various functions and acts thatsit

                   WHY DO WE DO RECURSION?--
It helps in solving bigger & complex problems in a simple way &
You can convert recursion solution into iterration & vice versa (itterations are if and for loops)

                  If you are calling a function again and again then u may treat it as a seperate call in the stack.


So if we didn't have any base condition that means that the function calls will keep happening then the stack will be keep getting filled again and again and we know that
every call takes memory even if it is same functio or different function then if we are calling the function more than one time simultaneously then it will be in the memory
 for the another function untill it gives the another call and thus every call will take up a seperate memory adn then due to this memory of computer will exceed the limit
  and this is going to give STACKOVERFLOW ERROR (& this is the reason that website have this name due to this error😄😄)


                       As well we might think now in the normal way tha space being occupied is constant while onto the another way in the recursion for getting n objects
                       we will have to call n functions as well so in that way space is also been occupied more comparatively then why do we use it ??

                       */

public class NumberExampleRecursion {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5){
            System.out.println(5);
            return;
    }
        System.out.println(n);
        print(n + 1);
    }
}
