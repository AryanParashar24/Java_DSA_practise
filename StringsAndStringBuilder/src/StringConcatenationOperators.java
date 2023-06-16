import java.util.ArrayList;

public class StringConcatenationOperators {

    //Operataor is giving us more functionality and can Concatenate more than oone object tahtswhy it is why its called OPERATOR OVERLOADING.

    /*JAVA dosen't allow in some software programming in operator overloading but its supported in PYTHON & C as it actually leads to low programme building thatswhy it isn't allowed in JAVA
    thatswhy JAVA  has addedd the additional operator + from its own side so as to provide object s concatenation alongwith it fromits own side */

    public static void main(String[] args) {
        System.out.println('a' + 'b');//Adding up the UNICODE or ASCII value of em
        System.out.println("a" + "b");//just Concatanated
        System.out.println((char) ('a' + 3));

        //So here in it print("a" + "b") will give me a new object ab in the result then when the functionis over than GarbageCollection will come adn that will take it with it
        System.out.println("a" + 1);
        //this is same as after a few steps: "a"+ "1"
        // $$  integer will be converted to Integer that will call toString()

        System.out.println("Aryan" + new ArrayList<>());

        //here we know that 1 is an object of type integer hence it is toString bt here in ArrayList toString will return a bracket that is normal empty
        System.out.println("Aryan" + new Integer(56));

        //So just if we found any object here in the left then it will be sended to the .toString and if there is a string then it will add it up to the string
        //and if anything is not string then it will convert it to the string called as toString
        //System.out.println(new Integer(56) + new ArrayList<>());//OPerator plus is saying it can't be applied to integer and array list
        //In JAVA operator + can only be applied to a Primitive and when a it can work with complex object sas well but the only condition is that it should contain atleast one String type

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans); //Here it will thatswhy retrun 56[] as we haev put a string in between that is empty string

        System.out.println("a" + 'b'); // Here a will not convert in to some other datatype in any way and since one of them is String datatype so the answer will also get converted in to the String type

    }
}
