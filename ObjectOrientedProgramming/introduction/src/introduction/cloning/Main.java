package introduction.cloning;

import java.util.Arrays;

public class Main {
    //If the method we are including in the clas does have any exception which is being thrown by it then we will have to address it or place
    // in the class otherwise it will throw the exception it uis bein referencing to
    public static void main(String[] args) throws CloneNotSupportedException{
        Human aryan = new Human(20, "Aryan Parashar");
//        Human twin = new Human(aryan);

        Human twin = (Human)aryan.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(aryan.arr)); //so here earlier changing the cloned object object would ahve changed the original
        // object as well in the data structure but now since the deep clone is produced hence changing the cloned object wouldn't result
        // in changing the original obejct a s well

        System.out.println(Arrays.toString(twin.arr) + "is the twin array after changing the array and the above one was aryan array");
    }
}
