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
    public static void main(String[] args) {

        print1toN();

    }
}
