import java.util.*;
public class hashingQuesEasy {

    static void freqCount(int[] arr,int n){
        boolean [] visited = new boolean[15];
        // creating a hash array
        int [] hash = new int[15];
        for ( int i =0; i<n; i++){
            hash[arr[i]]+=1;

        }

        // printing freq of each element
        for ( int i =0; i<n;i++){
            if (!visited[arr[i]]) {
                System.out.println(arr[i] + " occurs " + hash[arr[i]] + " times ");
            }
            visited[arr[i]]=true;
        }

    }

    static void freqCount2(int[] arr, int n){
        boolean [] visited = new boolean [n];
         for(int i=0;i<n;i++){
             if(visited[i]){
                 continue;
             }
             int count =1;
             for ( int j=i+1;j<n;j++){
                 if (arr[i]==arr[j]){
                     count++;
                     visited[j]=true;
                 }
             }
             System.out.println(arr[i] + "->"+count);
         }
    }
    static void freqCount3(int [] arr, int n){
        HashMap<Integer, Integer> map=new HashMap<>();

        for ( int i =0; i<n; i++){
            int freq=0;
            if(map.containsKey(arr[i])) {
                freq = map.get(arr[i]);
            }
            freq++;
            map.put(arr[i],freq);
        }
        //printing it
        for(Map.Entry<Integer,Integer>it: map.entrySet()){
            System.out.println(it.getKey()+"--> "+it.getValue());
        }
    }
    static void freqCount4(int []arr, int n){
        boolean [] visited= new boolean[n];
        int maxFreq=0, minFreq=n;
        int maxEle=0, minEle=0;
        for ( int i=0;i<n;i++){

            if (visited[i]){
                continue;
            }
            int count =1;
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count+=1;
                    visited[j]=true;
                }
            }

            if (maxFreq<count){
                maxFreq=count;
                maxEle=arr[i];
            }
            if (minFreq>count){
                minFreq=count;
                minEle=arr[i];
            }
        }
        System.out.println("MAXIMUM : "+ maxEle + " has appeared "+ maxFreq+ " times");
        System.out.println("MINIMUM: "+ minEle + " has appeared "+ minFreq+ " times");
    }
    public static void freqCount5(int [] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<n; i++){
            int key=arr[i];
            int freq=0;
            if (map.containsKey(key)){
                freq=map.get(key);
            }
            freq++;
            map.put(key,freq);
        }

        int maxFreq=0, minFreq=n;
        int maxEle=0, minEle=0;
        //iterating
        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            int key=it.getKey();
            int freq=it.getValue();

            if(maxFreq<freq){
                maxFreq=freq;
                maxEle=key;
            }
            if( minFreq> freq){
                minFreq=freq;
                minEle=key;
            }
        }
        System.out.println("MAXIMUM : "+ maxEle + " has appeared "+ maxFreq+ " times");
        System.out.println("MINIMUM: "+ minEle + " has appeared "+ minFreq+ " times");
    }
    public static void main(String[] args) {
        //ques1: Count frequency of each element in the array
        Scanner sc=new Scanner(System.in);
        int n;
//        System.out.println("enter array size");
//        n=sc.nextInt();
//        int [] arr= new int[n];
//        System.out.println("enter array elements{note: max value of the element can be 14 and min 0}");
//        for( int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
        // 1st solution
        //freqCount(arr,n);

        //2nd way of solution
        //freqCount2(arr,n);

        //3rd way using hashmap
        //freqCount3(arr,n);

        //ques 2: Find the highest/lowest frequency element
        int arr[] = {10, 5, 10, 15, 10, 5};
        //1st solution

        //freqCount4(arr,6);

        //2nd solution
        freqCount5(arr,6);


    }
}
