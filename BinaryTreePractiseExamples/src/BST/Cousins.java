package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cousins {
    public static class CousinTree{
        int val;
        CousinTree left;
        CousinTree right;

        CousinTree(int val) {
            this.val = val;
        }

        CousinTree(int val, CousinTree left, CousinTree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    public boolean isCousins(CousinTree root, int x, int y){
        CousinTree xx = findNode(root, x);
        CousinTree yy = findNode(root, y);

        return(
                (level(root,xx,0) == level(root,yy,0)) && (!isSibling(root, xx, yy))    //here is the answer for our cousins finding boolean true or false
        );
    }

    CousinTree findNode(CousinTree node, int x){
        if(node == null){
            return null;
        }
        if(node.val == x){  //here retrun the node if the value of the node on whihc we are present matches with the value of the target x
            return node;
        }
                                    //but if not matches the value with the target then

        CousinTree n = findNode(node.left, x);    //initialize the value of the left side of the node as n by starting to find and check  the value of the node with the value of the target by searchin g firstly from the left side of the previous node
        if(n != null){
            return n;       // to check if the left side of the node is not null as if it is null then no child will be present of the node as according to the rules
        }
        return findNode(node.right, x); //if the left child of the previous node doesnt matches then look into the right side of the node
    }

    boolean isSibling(CousinTree node, CousinTree x, CousinTree y){
        if (node == null){
            return false;
        }

        return(
                (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left, x, y) || isSibling(node.right, x, y)
        );
    }

    int level (CousinTree node, CousinTree x, int lev){
        if(node == null){
            return 0;
        }

        if(node == x){
            return lev;
        }

        int l = level(node.left, x, lev+1);
        if(l != 0){
            return l;
        }
        return level(node.right, x, lev+1);
    }
}
