public class Scope {

                                                      /*MAIN TIP:

             ANYTHNG THAT IS INITIALISED OUTSIDE THE BLOCK CAN BE ACCESSED INSIDE THE BLOCK BUT ANYTHING INITIALISED WITHIN THE BLOCK CANNOT BE USED OUTSIDE THE BLOCK
               BUT BUT BUT ANYTHINGN INITIALISED OUTSIDE THE BLOCK CAN'T BE INITIALISED INSIDE THE BLOCK BUT ANYTHING INITIALISED INSIDE THE BLOCK CAN AGIN BE INITIALISED
                OUTSIDE THE BLOCK(THAT MEANS AFTER THE BLOCK GET OVER
                                                       */
    public static void main(String[] args) {
        int a = 30;
        int b = 25;
        String name = "Aryan Parashar";

        {
            //   int a = 34;   //Already initialised outside the box so we cannot iniitialise it again
            int c = 88;

            //WE CANNOT INITIALISE A VALUE OUTSIDE THE BOX BUT WE CAN CHANGE IT AS:-

            a = 56;
            name = "Iron Man";

            System.out.println(a);
            //Values initialised in the block, will remain in the block;that means that if any command has been given outside this box like to print any
            //assigned value of this box then it will give an error.
            System.out.println(name);
        }

        int c  = 90;       // Because the value initialise inside the block can again be initialised outside the block as well
        System.out.println(name);
        System.out.println(a);  // SO it isn't like we can't use any value thath has been changed in any box it is like depend on the initialisation like if the initialisation of a or b is done in the box and like asked for printing up the value of a or b outside the box will give wrror but if anything initialised outside and then changed within the box and then asked for the printing of the value outside the box will print the value of a changed inside the box
        System.out.println(c);


            //Scooping in FOR LOOPS:--

            for (int i = 0; i < 4 ; i++) {
               // System.out.println(i);
                int num = 90;
                a = 10000;
            }
        System.out.println(a);
    }             //So here we used the same reference variable which is a and name here in this class which are actually being changed but are not made again by again stating as
    // string name = ""    or int a = "" hence these are accepted and made to change as per the given instructions but we justr cant made a new reference variable if it has been
    //made already as it is feature in the java as a mode of safety!!

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
       // System.out.println(c);   //   <--HERE IT GIVES AN ERROR AS THE VALUE OF C CAN'T BE MADE POSSIBLE TO PRINT OUTSIDE THE BOX AS ITS
    //NOT POSSIBLE'
    }
}
