import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of primitives:--

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 56;
        arr[2] = 46;
        arr[3] = 356;
        arr[4] = 35;
        //[23,56,46,356,35]
        System.out.println(arr[3]);
        //Now it is actaully not a very good idea if we have to enter a lot of entries like of 100 so we can use for loop instead into this case

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));       // it is used to make it in the brackets
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }
                    //OR

//        for (int num : arr){//for every element in array print the element
//            System.out.print(num + " ");//here num element of the array
//        }
//
//        System.out.println(arr[5]);  //index out of bound error


            //Array of objects:--

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
