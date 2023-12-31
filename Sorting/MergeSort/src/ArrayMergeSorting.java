import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMergeSorting {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,5,9,7,4,8};
//        arr = mergeSort(arr);
        mergeSortinPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length /2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        /*It may be possible that one of the array whose elements are being copied in array k still have some of hte elements remaining
        in the array whihc are needed to be added in the array so for that */

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergeSortinPlace(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }

        int mid = (e+s) /2;

        mergeSortinPlace(arr, s, mid);
        mergeSortinPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        /*It may be possible that one of the array whose elements are being copied in array k still have some of hte elements remaining
        in the array whihc are needed to be added in the array so for that */

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}