package Arrays.easyL;

public class LargestElementInAnArray {
    static int find(int [] arr, int n){
        int largestNum=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largestNum){
                largestNum=arr[i];
            }
        }
        return largestNum;
    }
    public static void main(String[] args) {
        int [] arr={23, 50,12, 99, 10, 5};
        int ans=find(arr,6);
        System.out.println(ans);

        // another approach is to sort the arrays using Arrays.sort(arr) and then print the last element

    }
}
