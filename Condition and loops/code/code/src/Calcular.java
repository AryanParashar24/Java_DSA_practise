import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                int ans = 0;
        while (true){
            //take the operator as the input
            System.out.println("Enter the operator :");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two number
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                        if (op == '+'){
                            ans = num1 + num2;
                        }
                        if (op == '-'){
                            ans = num1 - num2;
                        }
                        if (op == '*'){
                            ans = num1 * num2;
                        }
                        if (op == '/'){
                            if (num2 != 0) {
                                ans = num1 / num2;
                            }else{
                                System.out.println("Check out the numbers and operator again");
                            }
                        }
                        if (op =='%') {
                            ans = num1 % num2;
                        }
                } else if(op == 'x' || op =='X'){
                     break;
                }else{
                System.out.println("Invalid Opeation!!");
                }
                System.out.println(ans);
            }
        }
    }

