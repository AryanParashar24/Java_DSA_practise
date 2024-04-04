package DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PathCOmbination4Sum {

    /*
    Now the Time COmplexity will eb O(NlogN) if the Tree is balanced while on the other hand if the Tree isnt balanced then the time complexity will be O(N^2)
     */

    int countPaths(Node node, int sum){
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    int helper(Node node, int sum, List<Integer> path){
        if(node == null){
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int sum = 0;
        //how many paths I can make
        ListIterator<Integer> itr = path.listIterator(path.size()); //Here we can form the ListIterator as :
        // Now here once we haev formed the list now after checking from top to bottom after checkign for the elemnts in the list we will be now checking fo the combination so formed form right to left in the list so formed
        while(itr.hasPrevious()){   //while the iterator has some previosuly stored values as well
            s += itr.previous();

            if(s == sum){
                count++;
            }
        }

        count += helper(node.left, s, path) + helper(node.right, sum, path);

        //backtrack                     now before we return the value we need to backtrack as we arent creating copies bt we r using the original path
        path.remove(path.size((0)-1);
        return count;

    }




    //NOW IF THE INTERVIEWER ASK US TO PUT THE COMBIANTIONS IN A LIST THEN WE WILL JUST HAVE TO PUT IT IN A LIST INSTEAD OF USING THE COUNTER THATSIT
    List<List<Integer>> findPaths(Node node, int sum){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();    //as we do need a current Path as well so new ArrayList
        helper(node, sum, path);
        return paths;           //as the helper isnt returning anythign it is just changing the main reference variable we already have
    }

    int helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths){
        if(node == null){
            return 0;
        }

        path.add(node.val);
//        int count = 0;    VBACAUSE WE DONT NEED A SUM OR COUNT HERE
//        int sum = 0;

        if (node.val == sum && node.left == null && node.right == null){
            paths.add(new ArrayList<>(path));       // so if the node is equal to the sum and we dont have any child then we can just add the path to the paths
        }else{
            helper(node.left, sum-node.val, path, paths);   // as we can see we arent messing up with the argumenst and jsut acting as a reference to the one in the other function
            helper(node.right, sum-node.val, path, paths);

        }

        //backtrack                     now before we return the value we need to backtrack as we arent creating copies bt we r using the original path
        path.remove(path.size((0)-1);
        return count;

    }
}
