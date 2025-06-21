package Arrays.mediumL;

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

    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        int ans[]=RearrangebySign(arr,4);
        for(int val: ans){
            System.out.print(val+" ");
        }
    }

}
