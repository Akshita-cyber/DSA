package Sorting;

public class selection_sort {
    static void selectionSort(int [] arr, int n){
        for (int i = 0; i<n; i++){
            int mini = i;// index of the current minimum element
            for ( int j=i+1;j<n ;j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
           // swap
           int temp=arr[i];
           arr[i]=arr[mini];
           arr[mini]=temp;
        }

        System.out.println("after selection sort");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int [] arr={7,3,10, 20,5};
        System.out.println(" before selection sort "  );
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort(arr,5);

    }
}
