package DFS;

public class DFS_Using_Stack {
    void dfsStack(Node node){
        if(node == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            Node removed = stack.pop();
            System.out.println(removed.val + " ");
            if (removed.right != null){
                stack.push(removed.right);
            }if (removed.left != null){
                stack.push(removed.left);
            }
        }
    }

}
