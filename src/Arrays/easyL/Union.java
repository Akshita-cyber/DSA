package Arrays.easyL;

import java.util.*;

public class Union {
    static ArrayList<Integer> Union(int arr1[], int arr2[]){
        int n1= arr1.length;
        int n2= arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        // things to check:
        //1. no number should be repeated, if any number is coming twice , don't write it again
        //2. unique numbers from both should be there
        //3. should be in order
        for(int i=0;i<n1;i++){
            list.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            if(!list.contains(arr2[i])) {
                list.add(arr2[i]);
            }
        }
        Collections.sort(list);
        return list;

    }
    static ArrayList<Integer> findUnion(int []arr1, int []arr2,int n,int m){
        int i=0,j=0;
        ArrayList<Integer> union=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<arr2[i]){
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.isEmpty()||union.get(union.size()-1)!=arr2[i]){
                    union.add(arr2[i]);
                }
                j++;
            }
        }
        while(i<n){
            if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(union.isEmpty()||union.get(union.size()-1)!=arr2[i]){
                union.add(arr2[i]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
    //arr1[] = {1,2,3,4,5}
        // arr2[] = {2,3,4,4,5}
        //Output:
        // {1,2,3,4,5}
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};
        //System.out.println(Union(arr1,arr2));

        //optimal approach

        System.out.println(findUnion(arr1,arr2,5,5));


    }
}
