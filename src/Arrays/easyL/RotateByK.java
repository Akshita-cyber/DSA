package Arrays.easyL;

public class RotateByK {
    static void Lrotate(int [] arr,int k, int n){
        k=k%n;
        int []temp=new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for (int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }
        int j=0;
        for (int i=(n-k);i<n;i++){
            arr[i]=temp[j++];
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void Rrotate(int [] arr, int k, int n){
        k=k%n;
        int []temp=new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for (int i=n-1;i>=k; i--){
            arr[i]=arr[i-k];
        }
        int j=0;
        for (int x: temp){
            arr[j++]=x;
        }
        for (int i =0;i<n;i++){
            System.out.print( arr[i]+ " ");
        }
    }
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};
        //Lrotate(arr,2,6);
        System.out.println("");
        //Rrotate(arr,2,6);

        //REVERSAL ALGORITHM
        //optimised approach for Right rotate
        //Step 1: Reverse the last k elements of the array { 1,2,3,6,5,4}

        //Step 2: Reverse the first n-k elements of the array. {3,2,1,6,5,4}

        //Step 3: Reverse the whole array.{4,5,6,1,2,3}

        //for left rotate
        //Step 1: Reverse the first k elements of the array

        //Step 2: Reverse the last n-k elements of the array.

        //Step 3: Reverse the whole array.



    }
}
