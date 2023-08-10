import java.util.ArrayList;
import java.util.List;

public class SubseqIteration {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){

        //Here it was talking about the outer list being produced which is the main list
        List<List<Integer>> outer = new ArrayList<>();

        //Here the outer list is made which is initiased to be empty in the starting
        outer.add(new ArrayList<>());

        //To return the number of list based on the size of the existing list in the space like if the number is 2 in [1,2,3]
        //then we will be having []and [1] for 2 as the size of the array so there will be 2 lists from 2 which adds up to 4 objects in the list as a result of which there will be 4 new lists being included inthe array from 3
        //and then finally the total size of the list is then sumed to all the lists got by all the elements in the list
        for(int num : arr){
            int n =outer.size();
            for (int i = 0; i < n; i++) {
                //To create this list by the internal list being created seperately in each iteration
                List<Integer> internal = new ArrayList<>(outer.get(i));//Here in this the new element is being taken and copied in to the previously existing
                //elements in the array and thus the new lists obtained by adding that elements in the previous lists gives out new lists to be added to the outer or the main List

                internal.add(num);

                //the answer so got in the inner list is being added to the main or the outer list by this fuynction in the last
                outer.add(internal);
            }
       }
        //To return the outer list so formed in the program to the main function
        return outer;
    }
}
