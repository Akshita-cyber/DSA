package Arrays.hardL;

import java.util.ArrayList;

public class countInversions {
    static  int  numberOfInversions(int []arr, int n){
        return mergeSort(arr,0,n-1);
    }
    static int mergeSort(int []arr, int low, int high){
        int cnt=0;
        if(low>=high)return 0;
        int mid=(low+high)/2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }

    static  int merge(int []arr, int low, int mid, int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left= low;
        int right=mid+1;
        int cnt=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                cnt+=(low-mid+1);
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}
