import java.util.ArrayList;

public class SearchAndList {
    /*
    Here inthis problem we have to put the list in the function and not in the arguments of the function and thus retrun the answer in this form
    Now the general question may arrise in our mind is that the list so formed will be formed in each and every function and the list will be new and empty
    so thus how will we be able to  store and get to the required answer as required for us
    So for this we will be creating the list which willl be created only for that seperate function only and then when all the functions are being called then
    the answers been collected in each and every list in our function will be carried away and taken to the main fucntion collectively and arranged in the new list been formed
    in hte function in the end
     */
    public static void main(String[] args) {
        int[] arr2 = {2,3,4,1,2,3,2};
        System.out.println(indexAllvoidLast2(arr2, 2, 0));

    }
    static ArrayList<Integer> indexAllvoidLast2(int[] arr2, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr2.length){
            return list; // Basically it meant that when we have reached the end then just return the list
        }
        //THis will ocntain the answer for that function call only
        if(arr2[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans =  indexAllvoidLast2(arr2, target, index + 1);

        list.addAll(ans);

        return list;
        //But dont use this method unless it is called or compulsory instead just use the indexAllvoidLast2 from the previous file which was SearchArray.Java
    }
}
