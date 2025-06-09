import java.util.*;
public class numberHashing {
    public static void main(String[] args) {
        int n;
        System.out.println("Input size of arrays");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Input elements of array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precompute
        int [] hash =new int[13];// hash array
        for (int i=0;i<n;i++) {
            hash[arr[i]]+=1;
        }

        int q;// no of times you want to check
        System.out.println("enter no of times you want to check");
        q=sc.nextInt();
        for(int i = 0; i<q; i++){
            int number;
            number=sc.nextInt();
            System.out.println(hash[number]);
        }

    }
}
