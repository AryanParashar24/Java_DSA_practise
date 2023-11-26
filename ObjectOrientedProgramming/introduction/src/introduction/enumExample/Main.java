package introduction.enumExample;

public class Main {
    enum Week{
        //jaav.lang.enum class

        //we know that the java doesn't have any multiple inheritance and thus enum can't extends to another parent and thus can't perform inheritance
        //Neither enum can have the super class
        //Abstracts are not allowed neither the Overiding si allowed inside the class as already the interfaces r restricted in these functions


        //for the toString methods enum is Overriden prints the name of the enums constants

        //enum can implement as many classes it wants but can't have any interfaces
        Monday, Tuesday, Wednesday, thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //public, static and final
        //since its final you can create child enums
        //type is Week

        Week(){
            System.out.println("Constructor called for " + this);
        }
        //this is not public or protected, only private or default
        //why?  because public or protected might result in initialization of variable no. of objects i.e. more than one and we dont want to create new objects
        //because this is not the concept of enum

//        INTERNALLY IT WILL START LIKE THIS: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday; //so here in this we are initializing the iteration from where it will eb starting in the enum we specified above and then

        for(Week day : Week.values()){  //Here the iteration is going on startign from the initialization value of monday
            System.out.println(day);
        }

        System.out.print(week.ordinal());   //ordinal si the declaration of the position in the enum of the datatype been specified inthe DS
    }
}
