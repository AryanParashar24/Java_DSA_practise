import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*WHENEVR WE KNOW HOW MANY TIMES A TASK WOULD BE REPEATED OR DONE THEN FOR LOOP IS USED OTHERVISE WE USE A WHILE LOOP

        Syntex of fro loop:

        for (initialisation; condition; increament/decrement){
        //body
        }
         */

        //Q: print number from 1 to 5
//         for(int num=1; num<=5; num+=1){
//             System.out.println(num);
//         }

         //PRINT NUMBERS FROM 1 TO N
        Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//
//        for (int num = 0; num <=n; num++) {
//            System.out.print(num + " ");
   //     }
//        int num = 1;
//    while (num <=5){
//        System.out.println(num);
//    num +=1;
//       }

        //DO WHILE LOOP SYNTEX:

        int n = 1;
        do{
            System.out.println("Hello World");
        } while(n != 1);
        //DO WHILE LOOP is used because itr execute on hte given condition after performing the programme for atleast once
        //i.e. it will follow the given condition in the second  step
    }
}
