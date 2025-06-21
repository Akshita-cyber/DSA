package Arrays.mediumL;

public class MooresVoting {
    static int majorityElt(int []arr,int n){
        int el=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=arr[i];
            }
            else if(arr[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        cnt=0;
        for (int val: arr){
            if(val==el){
                cnt++;
            }
        }
        if(cnt>n/2) return el;
        else return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElt(arr,7 );
        System.out.println("The majority element is: " + ans);

    }
}
