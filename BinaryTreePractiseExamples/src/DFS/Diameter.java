package DFS;

public class Diameter {

    //so here as we can see we are first getting the answer form the left and then thr right answer and this is a type of post order type
    int diameter = 0;
    public int diameterOfBinaryTree(DFSNode root){
        height(root);
        return diameter-1;// Here it i calculating the number of nodes but we dont want the number of nodes bt instead the number of edges in the path form one node to other
    }

    int height(DFSNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
