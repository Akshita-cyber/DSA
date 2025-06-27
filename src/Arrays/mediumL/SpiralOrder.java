package Arrays.mediumL;
import java.util.ArrayList;
import java.util.List;
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int top=0,bottom=n-1,left=0,right=m-1;

        List<Integer> list=new ArrayList<>();
        while(left<=right && top<=bottom){
            //left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            //right to left
            if (top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }


}