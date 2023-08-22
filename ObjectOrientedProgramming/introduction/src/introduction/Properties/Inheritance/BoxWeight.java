package introduction.Properties.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){

        this.weight = 21;
    }

//    @Override         ---->>>> Here we can see that the error is acheived as the overriding is not possible in this but if we would lets say run it as in main class --
    static void greetings(){
        System.out.println("hey yo im in BoxWeight class. greetings!!");
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
        /*Her while we are writing super(other) it isn't giving any error in it because in it is totally refercing to the

        from introduction.Properties.Inheritance---------------------

         Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    and it is refernecing to the topic we discussed earlier in this packaghe form the main class as

    from intoduction.Properties.inheritance
            Box box5 = new BoxWeight(2, 3, 4, 11);
            where we need to check some of the rules which we were asked to check whenever this situation is implemented to check wheather it is corrector
             not and were told an important thing as----- $$ WHAT IS ACCESSED IS BASED ON THE REFERENCE TYPE AND NOT ON THE OBJECT TYPE

     $$  IMPORTANT why can't we have a child refering to the parent refernce variable

        there are many variables inboth parent and child classes
        you are gievn access to variables taht are in the ref type i.e. BoxWeight
        hence, you should have access to weight variable
        this also means, that the ones you are tying to access should be initialised
        but here, when the obj itself is of type parent class, how will you call the constructor of child class

         */



        /* Now coming back to the same old example we took from introduction.Properties.inheritance of the Box other as -----

        Box(Box old){
            this.l = old.l;
            this.w = old.w;
            this.h = old.h;
        }
        here offcource we could use weight with the Box tyep but since we have been using a child class with base class so weigth is a property of
         the BoxWeight other as well
         */
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }


    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);  // Also if we would try to initialize the super class after the initializing of the properties of the child case then it would give error as the Base classs have no knowledge of what properties does the base class is containing and thatswhy base class has to be initialized first then initializing the properties of the child class as the child class depends on the base class btu base class does nt
        // what is it?
        //To call the parent class constructor which is used to initiate values present in parent class

        super.h = 3;

//        this.weight = weight;
        super.weight = weight;
        //Here we can use super.l and this.l as well and both of them would goive the saem result btu now we may ask why do we have to use super and
        // this . if both of them follows the saem result well, if lets say weight is present in the base class as well i the child class as well
        // so if we want to point to the weight from the base class then we may write super.weight btu if we may have to refer to the weight from
        // child class then we may refer to it by this.weight


        /*
        super keyword is used when refering to the higher class i.e. to the child class has to refer to the parent class and to initialize the properties of the parent class

        super is used for representing the properties of the parent classes of the child class or the sub child class i.e. there might be some sub child classes as well
        reffering to its base class which is itself a child class of some other base class


        //EVERY SINGLE CLASS INHERATES THE OBJECT CLASS
         */
    }


}
