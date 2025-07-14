package Arrays.mediumL;
import java.util.*;
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ansList.add(generateRow(i));
        }
        return ansList;
    }
    public List<Integer> generateRow(int row){
        int ans=1;
        List<Integer> list =new ArrayList<>();
        list.add(ans);
        for(int i=1; i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
    public int generateElt(int n, int r){
        int ans=1;
        for(int i=0;i<r;i++){
            ans=ans*(n-i);
            ans=ans/i+1;
        }
        return ans;
    }
}
