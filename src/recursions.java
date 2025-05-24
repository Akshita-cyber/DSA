public class recursions {
    static int cnt=1;
    static void print1toN(){
        if(cnt==11){
            return;
        }
        System.out.println(cnt);
        ++cnt;
        print1toN();

    }

    static void printName(String name,int N ){
        if (cnt>N) return;
        System.out.println(name);
        cnt++;
        printName(name,N);
    }
    static void printNto1( int N){
        if(N==0) return;
        System.out.println(N);
        printNto1(N-1);
    }
    static int sum(int i,int N) {
        if (i > N) {
            return 0;
        }
        return i+ sum(i+1, N);
    }

    //parametrized way of calculating sum
    static void calcSumParametrizedWay(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        calcSumParametrizedWay(n-1, sum + n);
    }
    static int calcSumFuncRecur(int n){//calculating sum using functional recursion
        if(n==0){
            return 0;
        }
        return n +calcSumFuncRecur(n-1);

    }
    static int fact(int n){
        if (n<1){
            return 1;
        }
        return n * fact(n-1);
    }

    static int[] reverseArr(int[] arr, int size, int i){
        if (i>size){
            return arr;
        }
        int temp=arr[i];
        arr[i]=arr[size-1];
        arr[size-1]=temp;

        return reverseArr(arr,size-1,i+1);

    }
    static boolean isPalindrome(String s, int i, int j){
        if (i>j){
            return true;
        }
        if (s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalindrome(s,i+1,j-1);
    }

    public static void main(String[] args) {

        //print1toN();
        //printName("Akshita",5);
        //printNto1(10);
        //sum(1,10);
        //calcSumParametrizedWay(4,0);
        //System.out.println(calcSumFuncRecur(4));
        //System.out.println(fact(5));
        // REVERSING AN ARRAY
        int [] array ={1, 2, 3, 4, 5};
        //reverseArr(array,5,0);
        //for ( int num : array){
        //    System.out.print(" "+ num);
        //}
        System.out.println(isPalindrome("akshita",0,4));


    }
}
