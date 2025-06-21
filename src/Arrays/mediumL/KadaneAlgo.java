package Arrays.mediumL;

public class KadaneAlgo {
    static int maxSubarraySum(int []arr,int n){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi) maxi=sum;
            if(sum<0)sum=0;
        }
        return maxi;
    }
}
