public class CeilingOfString {


    //                                                           LEETCODE LINK

    //                               https://leetcode.com/problems/find-smallest-letter-greater-than-target/



    /*So here in the ceiling of the string even we will be flooring in the same order and its been given in the question that it wraps around in the array
    so that means that  if the answer is not found in the array then it will have to provide the start index of the array that is it kind of wraps arround so
    for example an array as {a, d, e, n} and if it asks for the target as 'p' then the answer of it will be 'a'

    Here we can use an interesting approach as well where for example when the binary search is being runned then the answer can be given as START % LENGTH OF THE ARRAY
    which will give the remainder which will be the answer of it as if the start is say 2 then 2 % 4 = 2 so the answer will remain as 2 which is the index
    of the answer while if the start is same as the length which is possible if the target is ahead of the end which means it is out of the array then it
     will give remainder as 0 which will be the answer of it.
     */

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
