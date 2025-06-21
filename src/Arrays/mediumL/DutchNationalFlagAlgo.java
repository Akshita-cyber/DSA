package Arrays.mediumL;

public class DutchNationalFlagAlgo {
    //[0...low-1]->0
    //[low...mid-1]->1
    //[mid...high]->unsorted(0/1/2)
    //[high+1...n-1]->2
    static void DNF(int [] arr, int n){
        int low=0,mid=0,high=n-1;
        for(int i=0;i<n;i++){
            while(mid<=high) {
                if (arr[mid] == 0) {
                    //swap(arr[mid],arr[low]), low++ mid++
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                }
                else if (arr[mid] == 1) {
                    mid++;
                }
                else  {
                    //swap(arr[mid],arr[high] high--;
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,2,1,2,0,0,0};
        DNF(arr,11);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
