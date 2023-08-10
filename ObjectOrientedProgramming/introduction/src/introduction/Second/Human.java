package introduction.Second;

public class Human {
    String name;
    int age;
    boolean employed;
    // If we are talkin abt something that is same for all the objects within the class then that has to be kept as static in the
    // class teh main reason behind using static is that something that is defined before any object is even created in the class
    // or before evn any refernce variable is been assigned or created
    static long population;

    static void greet(){
        System.out.println("Yo!!");
    }
    public Human(String name, int age, boolean employed){
        this.name = name;
        this.age = age;
        this.employed = employed;
        population += 1;


//    this.greet();
//    So can't put this over her in this as it is static and we can't put anything that is anyway respected to the
//    instances in the static function and thus we will have to put "Humans." instead of this. in the code

        Human.greet();
    }

}
