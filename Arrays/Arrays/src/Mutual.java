import java.util.ArrayList;
import java.util.Scanner;

public class Mutual {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();     //ArrayList<>is seperate function and ()at the end is uesd for specifying of the space which is kinda done in the for loop
        Scanner in = new Scanner(System.in);

        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
