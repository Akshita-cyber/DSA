import java.util.*;
public class characterHashing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.next();

        //1. for only small case or only large case stings
        //precompute
//        int [] hash = new int[26];
//        for ( int i=0;i<s.length();i++){
//            hash[s.charAt(i)-'a']+=1;
//        }
//
//        int q;
//        System.out.println("how many characters you want to check");
//        q =sc.nextInt();
//        while(q-->0){
//            System.out.println("enter character you want to search");
//            char c;
//            c=sc.next().charAt(0);
        //fetch
//            System.out.println(hash[c-'a']);
//        }

        //2. Code if the string contains both uppercase and lowercase:
        int []hash=new int[256];
        for (int i =0;i<s.length();i++){
            hash[s.charAt(i)]+=1;
        }
        int q;
        System.out.println("how many characters you want to check");
        q =sc.nextInt();
        while(q-->0){
            System.out.println("enter character you want to search");
            char c;
            c=sc.next().charAt(0);
            //fetch
            System.out.println(hash[c]);
        }
    }
}
