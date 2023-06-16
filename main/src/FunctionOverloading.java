//FunctionOverloading:--
            // When it contains two functions with the same name but have different arguments then it i
public class FunctionOverloading {
    public static void main(String[] args) {     //It happens when the program is compiled so when the program is compiled at that moment the function
                 fun(45);                                                     //overloading is performed..
                 fun("Aryan Parashar");
               int ans =sum(56,67,45);
               System.out.println(ans);
    }
    static int sum1(int a,int b){
        return a + b;
    }

    static int sum(int a,int b,int c){
        return a + b +c;
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
