package BST;

import org.w3c.dom.Node;

import java.util.List;

public class PopulatingNextRightPointers {

    public static class Populate{
        int val;
        Populate left;
        Populate right;
        Populate next;

        Populate(int val) {
            this.val = val;
        }

        Populate(int val, Populate left, Populate right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public Populate connect (Populate root){
        if (root == null){
            return null;
        }

        Populate leftMost = root;

        while(leftMost.left != null){
            Populate current = leftMost;
            while(current != null){
                current.left.next = current.right;
                if (current.next != null){
                    current.right.next = current.next. left;
                }

                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}
