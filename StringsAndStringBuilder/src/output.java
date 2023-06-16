public class output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Aryan");
        System.out.println(new int[]{2,3,4,5});

        /*So basically here in print whatever we put here it calls .value and that actually calls .toString
        Thats how the sequence works
        Now here the .value will actually call for valueOf which will eventually calls for if the obj is null or somethin else if it is null then it will just repeat null but
        if it does nt contain null then it will eventually refer to .toString (as null.toString would have created problem theerfore it asked for the correction and checkinup
         of it firstly)*/

        /*actually the idea is that this object may have some access to some access to some method or function and this .(DOT) refers to that method which that object might corresponds
        to and imagine if we would ve put .null then does that null corresponds to some object or method that is not

        ok so if we ask to print an object then java dosen't know what to print as we didn't provided it with any kinda rollno or any other stuff and it doesnt know wht to print
         either it is HASHMAPS, Student class , main class so it just kind of adds up a default type as by adding an @ at the end ITS A KIND OF TEXTUAL RERPESENTATION
         but it dosen't help us much in it

         So in OOPS we will learn how to make it pretty and make this method to get overwrited into our own way which is its beauty itself
         In that way we normally print the thing in the Arrays.toString to use .toString in the Array form
         & THATS WE CALL AS FUNCTION OVERRIDING AS THE FUNCTION IS OVER RIDEN*/

        Integer num = new Integer(56);  //WRAPPER class(Integer is Wrapper class)
        System.out.println(num.toString());
        System.out.println(num);
        //So by it its just saying that there is no need to add the num.toString if we would have nt written the Integer num = new Integer(num.toString()) as it was using it to represent into the same way already in it
        //Wrapper class basically means that if we want to use all the oops principle with integer values because we know that the integers are stored in the stack memory and objects are created in heap memory in JAVA AS IN PYTHON EVERYTHING IS OBJECT SO EVERYTHING IS IN HEAP
        //So PRIMITVES  are stored in STACK MEMORY
    }
}


