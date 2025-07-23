package Arrays.hardL;
import  java.util.*;

public class revPairs {
    static int reversePairs(int [ ] arr){
        return mergeSort(arr,0,arr.length-1);
    }
    static int mergeSort(int []arr, int low, int high){
        if(low>=high)return 0;
        int cnt=0;
        int mid=(low+high)/2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }
    static int countPairs(int []arr, int low, int mid, int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while (right <= high && arr[i] > 2 * arr[right]) right++;
            cnt+=right-(mid+1);
        }
        return cnt;
    }
    static void merge(int []arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3, 1};

        int cnt = reversePairs(a);
        System.out.println("The number of reverse pair is: " + cnt);
    }
}
