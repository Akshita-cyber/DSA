package Arrays.mediumL;
import java.util.*;
public class Sort0s1s2s {
    static void sortArray(ArrayList <Integer> arr,int n){
        int cnt_0=0,cnt_1=0,cnt_2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0) cnt_0+=1;
            else if(arr.get(i)==1) cnt_1+=1;
            if(arr.get(i)==2) cnt_0+=2;
        }
        for(int i=0;i<cnt_0;i++) arr.set(i,0);
        for(int i=0;i<cnt_1;i++) arr.set(i,1);
        for(int i=0;i<cnt_2;i++) arr.set(i,2);
    }

    public static void main(String[] args) {

        int n = 6;
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
