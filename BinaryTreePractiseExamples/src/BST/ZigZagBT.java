package BST;

import java.util.*;

public class ZigZagBT {
    /*Now here we have ot add in the zig zag manner fo rour binary tree where the dequeue approach will be followed to add and remove the elements with the constant time

    NORMAL ORDER
    Here the elements will be removed from the front and added to the back

    REVERSE ORDER
    Here the elements will be removed from the back and will be added to the front of the queue
     */
    public static class TreeNode2{
        int val;
        TreeNode2 left;
        TreeNode2 right;

        TreeNode2(int val) {
            this.val = val;
        }

        TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    public List<List<Integer>> levelOrder(TreeNode2 root){   //initialised the List with the name TreeNode
        List<List<Integer>> result = new ArrayList<>(); //initialised the result list as the type ArrayList

        if(root == null){
            return result;
        }

        boolean reverse = false;

        Deque<TreeNode2> queue = new LinkedList<>(); //initialised the Queue of the TreeNode type, but we can't have new Queue so we are going to have the Linked List
        //IN CASE OF DOUBT PLZ REFER TO LinkList
        queue.offer(root);      // offer helps in adding the element in the end of the queue without having to brake any restriction and rule

        while(!queue.isEmpty()){
            int levelSize = queue.size();   //ok so the size of the queue is the leevl on whihc we are present in the tree, like if we see then in the ifrst level our size of queue was 1 and then after the siz eof the queue was 2 in the level 2 and so on...
            List<Integer> currentLevel = new ArrayList<>(levelSize); //at every level we will be having a list to store the elements in it.
            for (int i = 0; i < levelSize; i++) {

                if(!reverse){
                    TreeNode2 currentNode = queue.pollFirst();    // to knwo on which node we are working currently and the poll throws the top root node in the queue right now
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                }else{
                    TreeNode2 currentNode = queue.pollLast();    // to knwo on which node we are working currently and the poll throws the top root node in the queue right now
                    currentLevel.add(currentNode.val);

                    if(currentNode.right != null){              //ADDING UP OF ELEMENTS REVERSED AS THE NODES ENTERED WILL GET ENTERED IN THE REVERSE ORDER OTHERWISE
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);   //once the aboev loop finishes of checking if the node isn;t empty and then adding up the nodes in the currentLevel, we will add the currentLevel list in the main result
        }

        return result;
    }
}
