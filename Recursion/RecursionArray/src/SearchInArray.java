import java.util.ArrayList;

/*
As taught earlier tht there is only one object and different function call by different reference variable and soon as the one value is got it got added to the same obejct
to which every recursion variable is referring to.
 */
public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 18, 6, 9};
        int[] arr2 = {1,2,3,4,5,6,2,};
        System.out.println(search(arr, 6, 0));
        System.out.println(index(arr, 6, 0));
        System.out.println(indexLast(arr, 6, arr.length - 1));
        indexAllvoidLast(arr2, 2, 0);
        System.out.println(list);

//        System.out.println(indexAllvoidLast2(arr2, 2, 0, new ArrayList<>()));
          ArrayList<Integer> ans = indexAllvoidLast2(arr, 2, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean search(int[] arr, int target, int index){

       if(index == arr.length){
           return false;
       }
       return arr[index] == target || search(arr, target, index +1);
    }

    static int index(int[] arr, int target, int index){

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return index(arr, target, index + 1);
    }
    static int indexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return index(arr, target, index - 1);
    }

    /* it is a method by which we can just add any answer we might find in he code in the list and it is totally different from the one defined below in the list
    It is a static list instead of the ones we defined below where we defined the list inside the functions we formed
    */
    static ArrayList<Integer> list = new ArrayList<>();
    static void indexAllvoidLast(int[] arr2, int target, int index){
        if(index == arr2.length){
            return;
        }
        if(arr2[index] == target){
            list.add(index);
        }
        indexAllvoidLast(arr2, target, index + 1);
    }
    /*Now we will have to call this function in the main function and then command to print list command
    Or else if we don not want to initiate this list outside the function we can just include it inside the fucntion which we will be using as
    * */

    static ArrayList<Integer> indexAllvoidLast2(int[] arr2, int target, int index, ArrayList<Integer> list){
        if(index == arr2.length){
            return list; // Basically it meant that when we have reached the end then just return the list
        }
        if(arr2[index] == target){
            list.add(index);
        }
        return indexAllvoidLast2(arr2, target, index + 1, list);
    }
    //But dont use this method unless it is called or compulsory instead just use the indexAllvoidLast2 from the previous file which was SearchArray.Java
}
