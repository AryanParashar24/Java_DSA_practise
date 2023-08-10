import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factor3(36);
    }

    //Time complexity = O(sqrt(N))
    static void factor1(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                System.out.println(i + " ");
            }
        }
    }

    //Time complexity O(sqrt(n))
    static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i){
                System.out.print(i + " ");
            }else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    //Time and space complexity will be O (sqrt(n))
    // In order to list the numbers in the sorting order as in the first i were in the asceneding oprder in factors2
    // and all the n/i were in the desceneding order
    static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }
        //going in the negetive order as in the list we know taht the n/i were presen tin the decending order to we will be printing the nubers inthe reverse order till the 0 index
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
