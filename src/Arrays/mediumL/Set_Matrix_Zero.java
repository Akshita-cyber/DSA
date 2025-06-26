package Arrays.mediumL;

public class Set_Matrix_Zero {
    static void setMatrix0(int arr[][],int n,int m){
        boolean [] row=new boolean[n];
        boolean [] col=new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++){
            if (row[i]){
                for(int j=0;j<m;j++){
                    arr[i][j]=0;
                }
            }
        }

        for (int i = 0; i < m; i++){
            if (col[i]){
                for(int j=0;j<n;j++){
                    arr[j][i]=0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }


    static void setMatrix0_1(int [][]matrix ,int n , int m){
        int col_0=1;
        for(int i=0;i<n;i++){
            if (matrix[i][0]==0)col_0=0;
            for(int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if(matrix[0][j]==0||matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //handling first row
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        //handling first col
        if(col_0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        int [][]matrix={{1,1,1},{1,0,1},{1,1,1}};
        setMatrix0(matrix,3,3);
        //optimised one
        setMatrix0_1(matrix,3,3);
    }
}
