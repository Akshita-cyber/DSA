package Arrays.easyL;
import java.util.*;

public class SecondSmallestNDSecondLargestElt {
    static void getElements(int arr[], int n){
        int large=Integer.MIN_VALUE;
        int sec_large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            large=Math.max(large,arr[i]);
            small=Math.min(small,arr[i]);
        }
        for(int i=0;i<n;i++){
            if (sec_large<arr[i] && sec_large!=large){
                sec_large =arr[i];
            }
            if (sec_small<arr[i] && sec_small!=small){
                sec_small =arr[i];
            }

        }
        System.out.println("Second smallest is "+sec_small);
        System.out.println("Second largest is "+sec_large);

    }
    static void getElements2(int arr[], int n){
        int large=Integer.MIN_VALUE;
        int sec_large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]<small) {
                sec_small=small;
                small=arr[i];
            }
            else if(arr[i]<sec_small && arr[i]!=small){
                sec_small=arr[i];
            }
            if (arr[i]>large) {
                sec_large=large;
                large=arr[i];
            }
            else if(arr[i]>sec_large && arr[i]!=large){
                sec_large=arr[i];
            }
        }
        System.out.println("Second smallest is "+sec_small);
        System.out.println("Second largest is "+sec_large);


    }
    public static void main(String[] args) {
        int [] arr={23, 50,12, 99, 10, 5};
        //getElements(arr,6);


        //optimised approach
        getElements2(arr,6);
    }
}
