import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeqDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        List<List<Integer>> ans = Duplicate(arr);
        for(List<Integer> list: ans ){
            System.out.println(list);
        }
    }

    //Add new element in the list only in the list been added by the previous element in the list+
    static List<List<Integer>> Duplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < arr.length; i++){
            start = 0;

            //if current and previous elements inthe array scame sout to be equal in size
            if(i > 0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end  = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
