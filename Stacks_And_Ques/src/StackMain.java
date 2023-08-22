public class StackMain {

    public static void main(String[] args) throws Exception {

        DynamicStack stack = new DynamicStack(5);
//        CustomStack stack = new DynamicStack(5);  // as the parent can also be used as the type also

        stack.push(11);
        stack.push(14);
        stack.push(24);
        stack.push(4);
        stack.push(3);
        stack.push(22);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
