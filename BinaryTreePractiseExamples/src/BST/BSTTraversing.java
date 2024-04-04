package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTTraversing {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    public List<List<Integer>> levelOrder(TreeNode root){   //initialised the List with the name TreeNode
        List<List<Integer>> result = new ArrayList<>(); //initialised the result list as the type ArrayList

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>(); //initialised the Queue of the TreeNode type, but we can't have new Queue so we are going to have the Linked List
                                                        //IN CASE OF DOUBT PLZ REFER TO LinkList
        queue.offer(root);      // offer helps in adding the element in the end of the queue without having to brake any restriction and rule

        while(!queue.isEmpty()){
            int levelSize = queue.size();   //ok so the size of the queue is the leevl on whihc we are present in the tree, like if we see then in the ifrst level our size of queue was 1 and then after the siz eof the queue was 2 in the level 2 and so on...
            List<Integer> currentLevel = new ArrayList<>(levelSize); //at every level we will be having a list to store the elements in it.
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();    // to remove the currentNode from the queue safely
                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);   //once the aboev loop finishes of checking if the node isn;t empty and then adding up the nodes in the currentLevel, we will add the currentLevel list in the main result
        }

        return result;
    }
}