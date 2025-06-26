package Arrays.mediumL;

public class rotateImgby90Degree {
    static void rotateMat(int [][]matrix, int n,int m){
        int n1=n-1;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                ans[j][n-1-i]=matrix[i][j];

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void rotate(int [][]matrix , int n, int m){

        //transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                //swap matrix[i][j] with matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("gffyhf");
        //reversing each row
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                //swap matrix[i][j] with matrix[i][m-1-j]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //rotateMat(arr,3,3);

        //optimal
        rotate(arr,3,3);

    }
}
