public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 18, -12, 15, 22, 3, -67, -15};
                int target = 220;
        int ans = linearSearch3(nums, target);
        System.out.println(ans);
    }
      /* So lets say that whatever be the length of the array the best case is not depenedent on the length of the array if we are talking of the best case
      we will get the element at the very first place with only one comparision while onto the another hand The Worst case would be if we dosen't found it in the whole array


      So here lets say that if the program takes 100ns for 100 size and if it takes 200ns for 200size and 300ns for 300items then for 500items it will take 500ns for sure

       THIS IS KNOWN AS LINEAR TIME COMPLEXITY:- AS THE SIZE OF MY INPUT IS GROWING HOW MY TIME IS GROWING THAT IS KNOWN AS THE LINEAR TIME COMPLEXITY

       Lets say if the time taken to run 100 items is 1 milli sec and for 200 items also it takes 1 millisec only and same is for 300 and 400 items and so on So it doesn't depend how much items ur feeding it will give input in constant amount of time its known as
       THIS IS KNOWN AS THE CONSTANT TIME COMPLEXITY


       Just to tell the worst case time complexity is big'O'notation ,we will come to it in time complexity topic
       */


    //Search in the array: return the index if item found
//otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line,will execute if none of the return statements above have examined
        //hence the target not found
        return -1;
    }

    // search the target and return true or false
    static int linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
            //Here it is a constant and the constants are being written in capitals so tahtswhy we wrote it like this
            //her ethe Integer.MAX_VALUE  represent the highest or the max positive int that can be represented in 32 bits i.e. 2147483647
        }

        //run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        //this line,will execute if none of the return statements above have examined
        //hence the target not found
        return Integer.MAX_VALUE;
    }


        // search the target and return the element
    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        //this line,will execute if none of the return statements above have examined
        //hence the target not found
        return false;
    }
}