package Sorting;
import java.util.*;
public class merge_sort {
    static void mergeSort(int[] arr, int low, int high){
        if (low>=high) return;
        int mid=low+high;
        mergeSort(arr,low,mid);//left half
        mergeSort(arr,mid+1,high);//right half
        merge(arr,low,mid,high);//merge
    }
    static void merge(int [] arr, int low, int mid, int high){
        ArrayList<Integer> temp= new ArrayList<>();
        int left=low;//starting index of left half of the array
        int right=mid+1;//starting index of right half of the array

        //storing elements in the temporary array in a sorted manner//
        while (left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        if(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        if (right<=high){
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for(int i=low;i<=high;i++){
            arr[i]= temp.get(i-low);

        }
    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
