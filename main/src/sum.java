import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum2();
//    }

        int ans = sum3(20, 30);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
        int sum = a+b;                      //When the return function is used then the programme is over
        return sum;
    }
    static void sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int  sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }
}
