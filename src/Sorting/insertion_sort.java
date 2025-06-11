package Sorting;

public class insertion_sort {
    static void insertionSort(int [] arr, int n){
        // Start from the second element (index 1) because the first element is already "sorted"
        for (int i=1;i<n;i++){

            int current =arr[i];// current is the first elt of unsorted part
            int j =i-1;// this is to j to point to the last index of the sorted portion
            while(j>=0 && current<arr[j] ){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        System.out.println("after insertion sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int [] arr={7,3,10,20,5};
        System.out.println(" before insertion sort "  );
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSort(arr,5);

    }
}
