package Arrays.mediumL;

import java.util.HashMap;

public class longestSubarrayWithZeroSum {
    static int maxLen(int A[], int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum+=A[i];
            if(sum==0){
                maxi=i+1;
            }
            else{
                if(map.get(sum)!=null){
                    maxi=Math.max(maxi,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={9, -3, 3, -1, 6, -5};
        int res=maxLen(arr,6);
        System.out.println(res);
    }
}
