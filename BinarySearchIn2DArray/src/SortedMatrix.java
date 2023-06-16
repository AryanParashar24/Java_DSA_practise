import java.util.Arrays;

public class SortedMatrix {
    /*here we are left with the array that is sorted as a whole that means the whole array from the rows to column are been sorted so the approach
    we acn go for is that if we found the middle column and then apply binary search in it and if we found the element to be bigger than the target
    then we can just cancel all the elements before that number or else just cancel the numbers succeeding it thus cancelluing a lot of numbers and sorting it out
     and thus we can perform the binary search again and go for remianing up with only two rows with us by keep on cancelling all the rows either
     before the number or after the number we got in binary search */
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }
//41:48
    //Search in the row provided between the column provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) /2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;//be cautious

        if (rows == 1){
            return binarySearch(matrix, 0, 0,-1,target);
        }
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols / 2;

        //run the loop till 2 rows are remaining
        while(rStart < (rEnd - 1)) {//while this is true it will have
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid]  == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //now we have 2 rows left
        //check wheather the target is in the target of two rows
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        //search in 1st half
        if (target <= matrix[rStart][cMid - 1]){
              return binarySearch(matrix, rStart, 0, cMid-1,target);
        }
        //search in 2nd half
        if (target <= matrix[rStart][cMid + 1]){
            return binarySearch(matrix, rStart, cMid + 1,cols-1,target);

        }
        //search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1,0,cMid-1,target);

        }else{
            return binarySearch(matrix, rStart+1, cMid+1,cols-1,target);

        }

    }
}
