import java.lang.reflect.Array;
import java.util.Arrays;
/*So it is done in such kind in which the column as well the row is sorted in the way such that these are been arranged in the ascending order like column wise as well
row wise as well so inspite of searching up the whole array which is the normal answer to our question we can just go on with searching up the indexes and if the index we
search is more than our target then the whole column of it will going to get cancelled as the succeeding numbers in the row are even larger than the one saerched for so here
we are left with the ones remaining and amongst them as well if we try to search for the last remaining element in the row and if we find it lesser than the target then that
means that the proceeding numbers will be more smaller than this one so we can cancel them as well.
* */

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
