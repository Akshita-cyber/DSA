package Arrays.easyL;

public class moveZerosToEnd {
    static void moveZeros(int [] arr, int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if (arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if (arr[i]!=0){
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        int n=nums.length;
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        moveZeros(nums,n);
    }
}
