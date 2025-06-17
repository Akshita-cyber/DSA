package Arrays.easyL;

public class RotateByReversalAlgo {

    static void reverse(int []arr,int start, int end){
        for (int i=start,j= end ; i<j ; i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }
    static void Rrotate(int[]arr, int n, int k){

        reverse(arr,0,n-k-1);//reverse(arr,0,3)
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    static void Lrotate(int [] arr, int n,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        //Rrotate(arr,6,2);
        Lrotate(arr,6,2);
        for (int i = 0; i < 6; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
