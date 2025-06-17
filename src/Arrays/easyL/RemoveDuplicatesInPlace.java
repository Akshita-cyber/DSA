package Arrays.easyL;

import java.util.HashSet;

public class RemoveDuplicatesInPlace {
    static int removeDuplicates(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return set.size();
    }

    static int removeDuplicates2(int[] arr, int n){
        int i=0;
        for (int j = 01; j < n; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }

        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
//        int k=removeDuplicates(arr, 7);
//        System.out.println("The array after removing duplicate elements is ");
//        for(int i=0;i<k;i++){
//            System.out.print(arr[i]+" ");
//        }

        //optimised
        int k = removeDuplicates2(arr, 7);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
