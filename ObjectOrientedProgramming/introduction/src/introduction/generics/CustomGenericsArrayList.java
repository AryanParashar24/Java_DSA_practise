package introduction.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericsArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   //size  is also working as an index value in the function

    public CustomGenericsArrayList(){
        data = new Object[DEFAULT_SIZE];     //Here even after passing the generic type t which isn't defined here in this data format won't be
                                                // allowed as here we haven't yet defined wht is T and how does it functions and wht is it anyway
    }

    public void add(T num){
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
        Object[] temp = new Object[data.length * 2];
        
        //copy the current items in the temp array being made
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed  = (T)(data[--size]);//here we will have to cast it because in the smaller type/more restricted one we r trying to add a bigger one
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;//since we r adding in the bigegr one a smaller one so the casting isn't really required here at the moment
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
        CustomGenericsArrayList list = new CustomGenericsArrayList();
//        list.add(1);
//        list.add(5);
//        list.add(11);
//        list.add(21);
//        list.add(51);
//        list.add(101);
//        list.add(31);

//        for (int i = 0; i < 14; i++) {
//            list.add(2*i);
//        }
//        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("weujuyfdeyuiwg"); //here we can see that the requirement is integer bt we r passing a string these r known Generics
                                    //Generics helps in passing a PARAMETERISED TYPE

        CustomGenericsArrayList<Integer> list3 = new CustomGenericsArrayList();
//        list3.add(45);
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);
    }
}
