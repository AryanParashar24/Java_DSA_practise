import java.util.ArrayList;
import java.util.Scanner;

//It is used in order u don't know that how many data or entires u will be filling in each array in the arraylist so for that arraylist is used its somewhat
// similiar to the VECTORS in C Language
public class ArrayListExample {
    public static void main(String[] args) {
        //syntex:
        ArrayList<Integer> list = new ArrayList <>(5);
        Scanner in = new Scanner (System.in);
                //Ok so int we sue to write is primitive and here Integer is generic
//        list.add(67);
//        list.add(4534);
//        list.add(435);
//        list.add(456);
//        list.add(133);
//        list.add(67);
//        list.add(4534);
//        list.add(435);
//        list.add(456);
//        list.add(133);
//
//
//        System.out.println(list.contains(76342));
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list of index will not work here
        }

        /*Ok so whatever the initial capacity we entered bt we can fill up additional ones as well with it is because:--
        1)) Size is FIXED INTERNALLY!!
        2)) Say analyst fills by some amount
         --> It will create a new array list of say double the size
         --> Old elements are copied in the new one
         --> Old one is deleted

         It is all because ammortised Time Complexity which we will know abt in Time Complexity


         If you wanna know how it is happenning u may see it up in the Arraylist.java beng provided by the java people
          */
        System.out.println(list);
    }
}
