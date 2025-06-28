package Arrays.mediumL;

public class LongestSubarrayWithGivenSum {
    static void hello(int []arr, int n, int k){

        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;

            for(int j=i;j<n;j++){
                sum+=arr[j];
                
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
}
