package Arrays.hardL;

public class repeatingAndMissingNumbers {
    //repeating and missing numbers A and B where A repeats twice and B is missing.
    static void find(int arr[],int n){
        int A=-1,B=-1;
        for(int i=1;i<=n;i++){
            int c=0;
            for(int  j =0;j<n;j++){
                if (arr[j]==i){
                    c++;
                }
            }
            if (c==2){
                A=i;
            } else if (c==0) {
                B=i;
            }

            if(A!=-1 && B!=-1)
                break;
        }

        System.out.println("Repeating: "+ A+"\nMissing: "+B);

    }

    static void findBetter(int []arr, int n){
        int missing=-1,repeating=-1;
        int []hashArr=new int[n+1];
        for(int i=0;i<n;i++){
            hashArr[arr[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(hashArr[i]==0) missing=i;
            else if(hashArr[i]==2)repeating=i;

            if(missing!=-1&&repeating!=-1)break;
        }

        System.out.println("Repeating: "+ repeating+"\nMissing: "+missing);
    }

    static void findOptimal1(int arr[]){//using math
        long n=arr.length;
        long Sn=n*(n+1)/2;
        long S2n=n*(n+1)*(2*n+1)/6;
        long S=0,S2=0;
        for (int j : arr) {
            S += j;
            S2 += (long) j * j;
        }
        //X=repeating , Y=missing;
        //val1= S-Sn=X-Y
        //val2= S2-S2n= X2-Y2= (X+Y)(X-Y)
        long val1=S-Sn;
        long val2=S2-S2n;
        val2=val2/val1;//X+Y

        //(X+Y)+(X-Y)= 2X
        long x= (val1+val2)/2;

        //(X-Y)-(X+Y)= -2Y
        long y= (val1-val2)/(-2);

        System.out.println("Repeating: "+ x+"\nMissing: "+y);

    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        //find(a,8);
        //findBetter(a,8);
        findOptimal1(a);

    }
}
