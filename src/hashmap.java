import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter size of array");
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> mp= new HashMap<>();
        for (int i=0;i<n;i++){
            int key=arr[i];
            int freq=0;
            if (mp.containsKey(key)){
                freq=mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }

        int q;
        q=sc.nextInt();
        while(q-->0){
            int number;
            number=sc.nextInt();
            if (mp.containsKey(number)){
                System.out.println(mp.get(number));
            }
            else{
                System.out.println(0);
            }

        }
    }
}
