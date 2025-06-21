package Arrays.mediumL;

public class BuySellStock1 {
    static void BuyAndSell(int []arr,int n){
        int minPrice=arr[0];
        int maxPro=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-minPrice;
            maxPro=Math.max(cost,maxPro);
            minPrice=Math.min(arr[i],minPrice);
        }
        System.out.println(maxPro);
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        BuyAndSell(arr,6);
    }
}
