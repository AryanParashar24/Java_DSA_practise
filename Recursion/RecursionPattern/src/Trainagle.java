import java.util.Arrays;

public class Trainagle {
    public static void main(String[] args) {
        triangle(5, 0);
        triangle2(5, 0);
        System.out.println();
        triangle3(1, 0);
    }
    /*As we have already studied about it whenever we need to repeat something and pass any variable in the future function calls then we will need to put that
   the variable in the argument of the function */
    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if (c < r){
            System.out.print("*");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
    static void triangle2(int r, int c){
        if(r==0){
            return;
        }
        if (c < r){
            triangle2(r, c+1);
            System.out.print("*");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }

    static void triangle3(int r, int c){
        if(r>5){
            return;
        }
        if (c < r){
            System.out.print("*");
            triangle3(r, c+1);

        }else{
            System.out.println();
            triangle3(r+1, 0);
        }
    }

}