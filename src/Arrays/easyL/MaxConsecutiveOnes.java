package Arrays.easyL;

public class MaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int nums[]){
        int n=nums.length;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 0, 1, 1, 1};

        int ans=findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
