package introduction.Properties.Polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a+b;
    }
    //same class sum can be called as if they have difference in the arguments
    double sum(double a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(12, 3, 2);
        obj.sum(12, 3);
        //Now here we can see that the sum inthe first case is having double as a and b as int but in the return when we r using sum for 12 which
        // is a int and not a double then the double would automatically change to in tbut if the double value is being included in the int value
        // of b then it won't be possible

    }
}
