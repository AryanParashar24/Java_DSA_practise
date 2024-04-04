package DFS;

public class FlattenBT2LL {

    public void flatten(TreeNode root){
        TreeNode current = root;
        while(current != null){

            if(current.left != null) {    // to find the rightmost element on the LeftHand sub tree
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;      //will continue to go to the right until it find the null at the rigth of any right node on the path after traversing to the right most of the leftHandSide child}
                }

                temp.right = current.right;
                current.right = current.left;   //as we are putting all the current.left in the right of the curretn node also we will be setting the current.left as null
                curretn.left = null;
            }
            current = current.right;
        }
    }
}
