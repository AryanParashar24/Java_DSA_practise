package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseRightBSTLevel {
    public static class RTree {
        int val;
        RTree left;
        RTree right;

        RTree(int val) {
            this.val = val;
        }

        RTree(int val, RTree left, RTree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }
        public List<Integer> averageOfLevels(RTree root) {//here we doesnt have to store a whole list of integers in the answer of solution insteadn we just have to store the average of each level
            List<Integer> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Queue<RTree> queue = new LinkedList<>();
            queue.offer(root);      // offer helps in adding the element in the end of the queue without having to brake any restriction and rule

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    RTree currentNode = queue.poll();

                    if(i == levelSize-1){
                        result.add(currentNode.val);
                    }

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
//                averageLevel = averageLevel / levelSize; // here the added averageLevel value been calculated after adding up the numbers been removed from the queue gets divided from levelSize
//                result.add(averageLevel);   //here the result been calculated at the final stage when the level finally changes is returned as the result queue
            }

            return result;
        }
}
