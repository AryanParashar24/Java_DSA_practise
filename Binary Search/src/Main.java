
/* So BinarySearch is used to kindof reduce the number of comparisions that has to be done as compared to linear search for example where each and every element
 which will take a lot of time if we r checking for lets say a million elements for example for i million element a million searches r needed to be taken while for
 BinarySearch it will take only 20 comparison thus Finally taking less TIME
 */
public class Main {

    //WHENEVER U FOUND A SORTED ARRAY JUST USE BINARY SEARCH WITHOUT EVEN HESITATION AND IT WILL RUN MOST OF THE TIME
    public static void main(String[] args) {
        int[] arr = {-12,-9,-2,3,4,5,16,34,64};
        int target = 34;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        /*So the general idea of finding a number into an array a range been sorted in ascending or descending order by the middle term method is first we have to find the[middleterm]
        i.e. the integer part of the middle part of the array as the {first index as 0(in starting) + final index(as the length of the array - 1)} /2 then if the target value is
        greater then the middle part then we need to search for our target in the range next to the middle part and take middle part + 1 as the new start and keep on doin it up
        untill the middle term is found to be  == target value
         */

        //Best case scenerio of Binarysaerch if we found the taregt right in the middle in the first shot  so best case is always constant and dosen't depend on the size

        /* So here we can see on dividing the whole array in equal parts so sas to find the middle value so
        new length is getting halved again and again  and lets take the given non disturbed original array as the 0 level so in the next case length will be n/2 and then
        later for the 2nd level it is n/4 then n/8 and so on and it is kinda getting in to the formula as N/ 2^k for the kth level so its log(N) = log(2^k) so
        logN = K log2 -->  K = logN(base 2)  so its kind of the TOTAL NUMBER OF COMPARISIONS IN THE WOST CASE
         */

        // Total comparison in the worst case = logN
        /*Saerch in a million
        For Linear:-           ForBinary:-
        1 million               20 comparison
         */

    }

    //return the indedx
     static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2; //might be possible that we r working on an array that is very vy large in size and int value is limited only to a certain value
            //so if it exceeds that number thhen it might not allow that number and might give an error so for that:--

            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
     }
}