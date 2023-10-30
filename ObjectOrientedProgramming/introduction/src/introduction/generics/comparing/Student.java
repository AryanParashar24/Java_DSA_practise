package introduction.generics.comparing;

public class Student implements Comparable<Student>{ // Here we know that the comparable is interface type and the interfaces can perform generics types so
                                                //it is an example of interface with GENERIC TYPES
                                //Comparable<type_to_compare>

                    //Now since we are implementing an interface so it would be containing an abstract class as well which is compareTo method
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        //if diff == 0: means both are equal
        //if diff < 1; means bigger else 0 is smaller one

        return diff;
    }
}
