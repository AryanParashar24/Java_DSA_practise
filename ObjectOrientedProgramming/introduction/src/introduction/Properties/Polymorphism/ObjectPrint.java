package introduction.Properties.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {

        ObjectPrint obj = new ObjectPrint(54);
        //Now here in this, is we haven't ordered it to print the num value in it so now here Java will run and determines wht to return on its own
        // for that it will call the toString method and check if it is present in the above code and if it is nt present then it will call the
        // Object class and search for the value and then it will call the toString method present inthe Object class
        System.out.println(obj);
        // Now as above in the code we have introduced the toString method in the code and an override function as well to override the toString
        // method present in the object class file

        // $$  SO AT RUNTIME IT IS DECIDING THIS
            }
}
