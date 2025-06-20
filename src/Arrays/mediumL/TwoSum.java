package Arrays.mediumL;
import java.util.*;
public class TwoSum {
    //1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
    public static String twoSum(int []arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    //2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
    public static int[] twoSumIndex(int []arr,int target){
        int [] res={-1,-1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target=14;
        System.out.println(twoSum(arr,target));
        int[] ans=twoSumIndex(arr,target);
        System.out.println("2nd variant answer: ["+ ans[0]+", "+ ans[1]+"]");
    }
}
