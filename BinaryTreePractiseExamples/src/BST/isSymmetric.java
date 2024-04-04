package BST;

import java.util.LinkedList;
import java.util.Queue;

public class isSymmetric {

    public static class SymTree{
        int val;
        SymTree left;
        SymTree right;

        SymTree(int val) {
            this.val = val;
        }

        SymTree(int val, SymTree left, SymTree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean SymmetricEx(SymTree root){
        Queue<SymTree> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
//            SymTree<Integer> left = queue.poll();     here it is node so no generics as Queue is already giving us node only with SymTree type
            SymTree left = queue.poll();
            SymTree right = queue.poll();

            if(left == null && right == null){
                continue;
            }

            if(left == null || right == null){
                return false;
            }

            if(left.val != right.val){
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
