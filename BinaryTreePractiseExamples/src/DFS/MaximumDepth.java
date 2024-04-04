package DFS;

public class MaximumDepth {

    int depth = 0;
    public int maxDepth(TreeNode root){
        height(root);
        return depth;
    }

    int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        depth =  Math.max(leftHeight, rightHeight) + 1;
        return depth;
    }
}
