package introduction.acess;

public class AcessModifier {
    protected int num;
    public String name;
    int[] arr;

    public int getNum() {
        return num;
    }
    // Now here we would be able to use the num even after being the private as because the getter and setter used in it to get and set values of
    // num are public so we can access it even from som eother package as lets atke for singleton package Main.java

    public void setNum(int num) {
        this.num = num;
    }

    public AcessModifier(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

/* Now it wou;d be much easier for us if we were abl;e to use these private, public, private or no modifier kind of types with some sort of table
 as:--

                           ________________________________________________________________________________________________
                           |                 |Class  |   Package |   Subclass    |   Subclass    |         World          |
                           |                 |       |           |  (same class) |   (diff pkg)  |(diff pkg & nt subclass)|
                           |_______________________________________________________________________________________________
                           | public          |   +   |       +   |       +       |       +       |           +            |
                           | protected       |   +   |       +   |       +       |       +       |                        |
                           | no modifier     |   +   |       +   |       +       |               |                        |
                           | private         |   +   |           |               |               |                        |
                           ________________________________________________________________________________________________

                                             "+" means that yes they have the permission to do it



                                             Lets discuss about the type sof Packages

                                             Package
                                                |
                                                |
                                                |
                                _________________________________________
                                |                                       |
                                |                                       |
                                |                                       |
                             User-defined Packages                  In-Built Packages
                                                                        |
                                                                        |
                                                                        |
               ----------------------------------------------------------
               |
               |
               |
               |-----------------------lang
               |                                It contains all of very impoartant stuff of java which are mandatory to be used like those used in
               |                                primitive data types which are used in classes like all the arithematic operations stuff like +, -,*,/
               |                                and all the other important stuff in which are really mandatory stuff like int char and all the other
                                                important data types

               |
               |
               |
               |------------------------io
               |                            It contains input output fiel in java for the file reading which are optimizing input output files in java
                                            for competitive programming buffer reader and all of these stuff are java files
               |
               |
               |
               |
               |-------------------------util
                                            it contains the utility package liek it is used when we initialize arrays in our data structure like with
                                            Java.util.Arrays it contains the collection framework for data structure.
               |
               |
               |
               |
               |-------------------------applet
                                            here it is more of in the development side
               |
               |
               |
               |
               |--------------------------awt
                                            it is mostly used while using fo rhte graphical user interface and stuff for creating up the button and stuff
               |
               |
               |
               |
               |-------------------------net
                                            it is used when the networkign and all is done iwhen connecting our app to web and some other networking stuff as well
 */


