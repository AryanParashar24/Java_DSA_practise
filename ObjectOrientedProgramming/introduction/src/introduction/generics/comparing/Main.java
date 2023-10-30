package introduction.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student Aryan = new Student(6, 91.11f);
        Student Ashish = new Student(16, 90.11f);
        Student Ayaan = new Student(10, 51.11f);
        Student Aditya = new Student(1, 81.11f);

        Student[] list = {Aryan, Ashish, Ayaan, Aditya};

        System.out.println(Arrays.toString(list));

        //Array.sort(list) then this compare function been used below wouldn't have been reuired although thte compareTo function would ve been still req.
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return (int)(o1.marks - o2.marks);   //this wouldn't have been required if the compare function haven't been put into the sort() function
//                return -(int)(o1.marks - o2.marks);     //to get the sorted array in the descending order
//            }
//        });      // nwo here since we specified by using the comaprable method and then asked to sort according to the marks otherwise
//        // by default it would have just sorted it based on the data or the keyword present on the 0th index.

                                            //SMALLER VERSION OF THIS COMPARABLE AND SORT TYPE
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks)); //this si the smalelr version ot write Arrays.sort tand then the comparable
        // as well including the whole of those lines in the code

        System.out.println(Arrays.toString(list));

//        if(Aryan > Ashish){
//            //here we r getting an error because we haven't provided any anything to decide which one to compare hence we will have to implement
//            // comparable in the main fiule to decided whihc one to comapre in the code while implmenting the code
//            System.out.println("Aryan has more marks then Ashish");
//        }
        if(Aryan.compareTo(Ashish) < 0){
            System.out.println("Aryan has more marks");
        }
    }
}
