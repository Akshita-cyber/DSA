package Arrays.easyL;

public class IsArraySorted {
    static boolean isSorted(int [] arr, int n){

        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr={23, 50,12, 99, 10, 5};
        System.out.println(isSorted(arr,6));

        int [] arr2={1,2,3,4,5,6};
        System.out.println(isSorted(arr2,6));
    }
}
