public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swaping the numbers:-");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String name = "Aryan Parashar";
        String changedName = changeName(name);
        System.out.println(changedName);

    }
                                       //SCOPING
    static String changeName(String naam) {          //   <-- HERE IT IS THE SCOPE OF THE OBJECT THUS IF WE WILL ASSIGN TO PRINT THE NAAM
        naam = "Iron Man";                          //OUT SIDE THIS  FUNCTION THEN IT WILL NOT WORK SO IT IS KIND OF THE SCOPE OF THIS OBJECT.
         return naam;
        // HERE AS WE CAN SEE THAT WHEN WE CHANGE THE NAME TO NAAM OR EITHER TO ANYTHING ELSE IT WON'T MATTER AS ACTUALLY HERE IN
        //JAVA THESE USUALLY PASSES THE COPY OF THE VALUE NOT PASSING   THE REFERENCE OF THE VALUES SO HERE THE COPY OF THIS NAME
        //IS PASSED TO THE STRING NAAM .   SO THEY ACTUALLY PASS THE VALUE NOT THE REFERENCE
    }
}
