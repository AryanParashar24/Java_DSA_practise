public class Main {
    /*
    Here in this for the recursion to take placxe inn array we will be generating a condition and &&(AND) operator to be used for
calling the same function with n-1 and the final condition is being given  till the function ends if the index=final no. in array
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 2};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }

        return arr[index] < arr[index + 1] && sort(arr, index + 1);
    /*
    Here it is the same object bt different referneces so it is called by the value by the reference

    So in the same way in any refernce call u change or modify the array then it will be changed for all the other reference calls as well
     */
    }
}