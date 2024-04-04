package DFS;

public class LowestCommonAncestor {

    // it will take o(logn) space and o(n) time complexity    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }

        if(node == p || node == q){
            return node;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        return left == null ? right : left; //if left == null then return right otherwise if it isn't null then return left
    }
}
