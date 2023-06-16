import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TYPE CASTING--
//                int num = (int)(57.34f);
//                        System.out.println(num);

        //automatic type promtoion in expression
//        int a = 257;
//                int b = (byte)(a);
        //MAXIMUM VALUE OF A BYTE IS 256bits soits kinda doing 257%256=1
                //(byte)(a) because a is a type integere and we tries to provided inthe smaller type

//        System.out.println(b);
        //we got 1 as answer as in byte we can save a total of only 256bits and we asked to keep 257 so it kinda came with the
        //with the modulus that is remainder that is 1

//        byte a = 40;
//        byte b = 34;
//        byte c = 56;
//        int d = a * b / c;
//
//        System.out.println(d);

         //FACT!! NOW THE QUETSION ARISIES IS 40 * 34 IS 1360 WHICH IS WAY MORE THAN 256 AND HOW ITS HANDLING IT IF WE ARE
        //TACKKLING WITH THE BITS THGEN BIT SHOULD COME SO TO HANDLE WITH IT JAVA AUTOMATICALLY CHANGES IT TO THE INTEGER TYPE
        //TO HANDLE THIS KIND OF PROBLEM.SO THIS FUNCTION/EXPRESSION IS PERFORMED USING INTEGERE AND NOT BY  BYTE

//
//        byte b = 50;
//                b = b * 2;
                // Now this will give an error as we learnt whenever we do bytye evaluation then java automatically converst in
        //into integer and how can we assign byte value to an integer as written inthe first linesame as we cant asssign float to
        //an integer without assigning type casting

//        int number = 'A';
//        System.out.println(number);
// Its telling out the unicode values which is possible in java as same in python

//        System.out.println(3 * 5.6);

        //if any one of the operant is float then whole result we be a float or else if one of the operant is double then the whole
        //result is also double as seen in the result


//               byte b = 50;
//               char c = 'a';
//               short s = 1024;
//               int i = 3000;
//               float f = 5.34f;
//               double d = 10.2344;
//               double result = (f * b) + (i / c) -  (d * s);
//               // float + int - double = double (telling out the final types after binary calculations)
//               System.out.println((f * b) + "" + (i / c) + "" + (d * s));
//               System.out.println(reuslt);

    }
}


