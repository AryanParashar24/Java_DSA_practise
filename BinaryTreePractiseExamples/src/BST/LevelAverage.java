package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAverage {

    public static class Tree {
        int val;
        Tree left;
        Tree right;

        Tree(int val) {
            this.val = val;
        }

        Tree(int val, Tree left, Tree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    public class Solution {
        public List<Double> averageOfLevels(Tree root) {//here we doesnt have to store a whole list of integers in the answer of solution insteadn we just have to store the average of each level
            List<Double> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Queue<Tree> queue = new LinkedList<>();
            queue.offer(root);      // offer helps in adding the element in the end of the queue without having to brake any restriction and rule

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                double averageLevel = 0; // here the averaegLevel is initialised and has been said to calculate and add up whenever the level change sso starting from the 0
                for (int i = 0; i < levelSize; i++) {
                    Tree currentNode = queue.poll();
                    averageLevel += currentNode.val; // Here the averagelevel will include and add up all the nodes which are getting removed from the queue after adding their children
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                averageLevel = averageLevel / levelSize; // here the added averageLevel value been calculated after adding up the numbers been removed from the queue gets divided from levelSize
                result.add(averageLevel);   //here the result been calculated at the final stage when the level finally changes is returned as the result queue
            }

            return result;
        }
    }
}