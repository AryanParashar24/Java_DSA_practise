package DFS;

public class findPathfromSet {
    //here init we will be given a set of some elements and we have to fond whether the elemenst are present in the tree we are having

    boolean findPath(Node node, int[] arr){
        if(node == null){
            return arr.length == 0;
        }

        return helper(node, arr, 0) //0 as the level for the binary tree
    }

    boolean helper(Node node, int[] arr, int index){
        if(node == null){
            return false;
        }

        if(index >= arr.length || node.val != arr[index]){
            return false;
        }

        if(node.left == null && node.right == null && index = arr.length -1){
            return true;
        }

        return helper(node.left, arr, index+1) || helper(node.right, arr, index+1);
    }
}

