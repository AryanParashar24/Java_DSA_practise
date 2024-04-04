package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NextNode {
    public static class Tree2 {
        int val;
        Tree2 left;
        Tree2 right;

        Tree2(int val) {
            this.val = val;
        }

        Tree2(int val, Tree2 left, Tree2 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    public class Solution {
        public Tree2 findSuccessor(Tree2 root, int target){
            if (root == null) {
                return null;
            }

            Queue<Tree2> queue = new LinkedList<>();
            queue.offer(root);      // offer helps in adding the element in the end of the queue without having to brake any restriction and rule

            while (!queue.isEmpty()) {
                     int levelSize = queue.size();
                    Tree2 currentNode = queue.poll();
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }

                    if(currentNode.val == target){
                        break;
                    }
            }
            return queue.peek();
        }
    }
}
