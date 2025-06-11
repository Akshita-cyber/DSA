package Sorting;

public class bubble_sort {
    static void bubbleSort(int []arr, int n){
        for(int i =n-1;i>=0;i--){
            //push the max to the last by adjacent swaps
            for( int j =0;j<=i-1;j++){
                if ( arr[j]>arr[j+1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("after bubble sort");
        for( int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int [] arr={7,3,10,20,5};
        System.out.println(" before bubble sort "  );
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr,5);
    }
}
