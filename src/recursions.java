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
    public static void main(String[] args) {

        //print1toN();
        //printName("Akshita",5);
        printNto1(10);

    }
}
