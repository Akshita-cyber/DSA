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
    public static void main(String[] args) {

        //print1toN();
        //printName("Akshita",5);
        //printNto1(10);
        //sum(1,10);
        //calcSumParametrizedWay(4,0);
        //System.out.println(calcSumFuncRecur(4));
        //System.out.println(fact(5));


    }
}
