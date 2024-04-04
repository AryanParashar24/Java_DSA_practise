package DFS;

import java.util.Arrays;

public class TreeBuilder {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder.length == 0){
            return null;
        }

        int r = preorder[0]; //root nod ein thr pre-order is going to be the 0th element in the array
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == r){
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index);  // converting to get the left hand side through the pre-order and in-order
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length);    // converting to get the right hand side through the in-order and pre-order

        return node;
    }
}
