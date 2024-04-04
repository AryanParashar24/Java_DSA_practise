package DFS;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root){
        if (root==null){
            return null;
        }

        TreeNode left = invertTree(root.left);  //it will retrun left node only but after swapping
        TreeNode right = invertTree(root.right);//it will retrun right node only but after swapping

        root.left = right;
        root.right = left;

        return root;
    }
}
