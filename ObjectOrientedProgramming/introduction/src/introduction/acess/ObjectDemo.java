package introduction.acess;

public class ObjectDemo {

    int num;
    float gpa;

    //first 2 are already done
    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num; //Now here we are checking for the num value of the ObjectDemo in the file for the comparision
//        return super.equals(obj);
    }

    //here hash is used to create hash codes out of the objects we have
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 8.97f);
        ObjectDemo obj2 = new ObjectDemo(34, 8.88f);

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());// Here we aill see taht the num in both the objects is saem btu still the hashcode produced would be
//        // different as hash is used for printing the hashcode of the object entered and since the objects are different therefore the hashcode will
//        // also be different

        if(obj == obj2){    // ehre == checks if the obj is pointing to the saem thing or nto
            System.out.println("obj1 si equal to obj2");
        }

        if(obj.equals(obj2)){   //this checks for the content in it and it is actually the method or the function in the program rather than some
            System.out.println("Obj2 is equal to obj");    // value or the pointer checking
        }

        System.out.println(obj.getClass().arrayType()); //so here the getClass is used to get information about the class
        // we have been suing like for getting the constructor or even any other data we may get it after writing getClass()
        // by a (.)and then followed by the request fo the data type we want information about

        //Also whtever we will get from the getClass will be stored in the heap memory and the information will be about the classobjects so it
        // will be having a lot more information to stroe as well
    }
}
