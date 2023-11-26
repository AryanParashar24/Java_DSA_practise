package introduction.cloning;

/*
clone is a method by which we can create an exact copy of an object. In Java.lan package there is an interface called clonable which must be
 implemented by the class who we must clone
 */
public class Human implements Cloneable{
    int age;
    String name;
    int arr[];

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 5, 6, 7};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    //Now the question we might be asking is that this Cloneable doesn't have any abstract method then why do we have to include it in the class,
    // its becasue we are telling the JVM(Java Virtual Machine) to that we are using this clone in the object of class Human

//    @Override//this clone is inside the object so we can use the Override function as well in the function
//    public Object clone() throws CloneNotSupportedException{
//
//        //THIS IS SHALOW COPY
//
//        return super.clone();  // Now in it if we try to return super.clone without using throwing exception then we must get an error saying
//                                // it throws an example so we must write it up

                        /*
                            SHALOW COPY
        Here in this example when we are cloning the original object insoem other object then in the non-primitves are made new for there
         values but when comes for the primitve types then the cloned object primitive types refers to the same object in the original object
          instead o creating new copied object. Thus, when the object is being changed in the cloned object then the original primitive type
           object will be changed.

        So in general wht do we mean by Shallow copy is that when some object is cloned which contains some other objects within itself then
         the cloned copy instead of copying and creating its own object just point out/ refer to the original object within the original
          object as a result of which the change in the cloned primitve object will also result to the change in the original object

           To solve it we use the DEEP COPY

                            DEEP COPY
        here in this type of copy the copied objects are being made inside the cloned object from the object inside the cloned object,
         even the primitive object types
                         */
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human) super.clone();

        //make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];

        }
        return twin;
    }
}
