package DFS;

public class PathSumRoot2leaf {

    //here the time complexity would be O(N) and so will be the space complexity as equal time would be taken for all the nodes in this problem

    public int sumNumbers(TreeNode root){
        helper(root, 0);
    }

    public int helper(TreeNode node, int count){
        if(node == null){
            return 0;
        }

        int NewSum = count*10 + node.val;


        if (node.left == null && node.right == null){
            return NewSum;
        }

        int leftSum = 0;
        int rightSum = 0;

        if(node.left != null){
            leftSum = helper(node.left, NewSum);
        }

        if (node.right != null){
            rightSum = helper(node.right, NewSum);
        }

        return leftSum + rightSum;
    }
}
