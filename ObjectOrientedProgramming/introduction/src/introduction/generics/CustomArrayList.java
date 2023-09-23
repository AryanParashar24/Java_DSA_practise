package introduction.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   //suize is also working as an index value in the function

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    //will be accessed only when the arrya has already reachedd to the final array index i.e. the limit of the array
    private void resize(){
        int[] temp = new int[data.length * 2];
        
        //copy the current items in the temp array being made
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed  = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(1);
//        list.add(5);
//        list.add(11);
//        list.add(21);
//        list.add(51);
//        list.add(101);
//        list.add(31);

        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("weujuyfdeyuiwg"); //here we can see that the requirement is integer bt we r passing a string these r known Generics
                                    //Generics helps in passing a PARAMETERISED TYPE
    }
}
