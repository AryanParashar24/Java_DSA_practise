import java.sql.SQLOutput;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
//        int a = 10;
//        if (a == 10) {
//            System.out.println("Hello World");
//
//        int count = 1;
//        while (count != 5){
        // (!= is not equal to)
//        System.out.println(count);
//        count++;

        // ALTERNATIVE WAY

        //FOR LOOP
//        for(int count = 1; count !=5; count++){
//            System.out.println(count);

            // whener we don't know how many times loop will execute then we should use while loop while if we know how
            //many times loop will run thn we use for loop

        Scanner in = new Scanner(System.in);
        System.out.println("plaease enter temp in C:");
        float tempC = in.nextFloat();

        float tempF = (tempC  * 9/5) + 32;

        System.out.println(tempF);
        }
    }


