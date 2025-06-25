package Arrays.mediumL;
import java.util.*;
public class RearrangeEltBySign {
//    Input:
//    arr[] = {1,2,-4,-5}, N = 4
//    Output: 1 -4 2 -5
    static int [] RearrangebySign(int []arr,int n){
        int ans[]=new int[n];
        int posIndex=0,negIndex=1;
        for(int i=0;i<n;i++) {
            if(arr[i]>=0) {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
            else{
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
        }
        return ans;

    }

    static int [] RearrangebySign2(int []arr,int n){
        int ans[]=new int[n];
        int j=-1;
        int posIndex=0,negIndex=1;
        for(int i=0;i<n;i++) {
            if(posIndex <n || negIndex<n) {
                if (arr[i] >= 0 && posIndex <n ) {
                    ans[posIndex] = arr[i];
                    posIndex += 2;
                    j++;
                } else if (negIndex<n){
                    ans[negIndex] = arr[i];
                    negIndex += 2;
                    j++;
                }
            }
            else{
                j++;
                ans[j]=arr[i];

            }
        }
        System.out.println(ans.length);
        return ans;

    }
    static void RearrangebySign3(int [] arr,int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for (int i=0;i<n;i++){
            if (arr[i]>0) pos.add(arr[i]);
            if (arr[i]<0) neg.add(arr[i]);
        }

        int [] ans=new int[n];
        int p=0,ne=0;
        int i=0;
        while (p<pos.size() && ne<neg.size()){
            ans[i++]=pos.get(p++);
            ans[i++]=neg.get(ne++);
        }

       //add remaining elements
        while(p<pos.size()){
            ans[i++]=pos.get(p++);
        }
        while(n<neg.size()){
            ans[i++]=neg.get(ne++);
        }
        for(int val:ans){
            System.out.print(val+" ");
        }

    }

    public static void main(String[] args) {
        //int arr[] = {1,2,-4,-5};
        //int ans[]=RearrangebySign(arr,4);
        int arr[] = {1,2,-4,-5,3,4};

        //variety 2
//        Input:
//        arr[] = {1,2,-4,-5,3,4}, N = 6
//        Output:
//        1 -4 2 -5 3 4

        //int ans[]=RearrangebySign2(arr,6);//<-but this is not a good approach for variety 2
        //for(int val: ans){
        //    System.out.print(val+" ");
        //}

        RearrangebySign3(arr,6);
    }

}
