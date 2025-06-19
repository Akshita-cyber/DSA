package Arrays.easyL;
import java.util.*;
public class missingNumber {
    static int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<n;i++){
            actualSum+=nums[i];
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}


