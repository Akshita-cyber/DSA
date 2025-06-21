package Arrays.mediumL;
import java.util.*;
public class MajorityElements {
    static int majorityElement(int []arr){
        int n=arr.length;
        //hashmap storing element and it's frequency and then iterating the hashmap returniing the key whose value is greater than n/2
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //now iterating
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue()>n/2){
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
