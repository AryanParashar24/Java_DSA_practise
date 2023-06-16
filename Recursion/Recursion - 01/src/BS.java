public class BS {

    public static void main(String[] args) {
        int[] arr = {1,2,3,55,76,89};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search (int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) /2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target) {             // So while using the recursion its very important to return the result of the function call of the return type
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m+1, e);   // So if we dosen't have any return in the end then it will give an error as in the end it is made to return a value in
                                                                     // the end & thus if we didn't add return in the end then it will give error

         /*SO WHENEVER YOU ARE HAVING A FUNCTION THAT HAS A RETURN TYPE(like int in the static int search) THEN MAKE SURE TO RETURN IT

         So overall whenever a sub-recursion call is happening then make sure to return it in the function
         and try to give the return type same as the type of recursion inthe function itself as well

         as the function proceeds to slice the array to half and more half to reach out to the answer the previous array will be stored inthe stack waiting for the answer/
         value to give back as to the call back

        */
    }
}
