package introduction.component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(2);       //ArrayList allows multiple threads can access ArrayList at the same time
        list2.add(3);
        list2.add(4);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(11);
        vector.add(12);     //Vectors on the other hand can be accessed by one thread at a time
        vector.add(13);
        vector.add(14);

        System.out.println(vector);
    }
}
