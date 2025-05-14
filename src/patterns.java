public class patterns {
    public static void main(String[] args) {
        //RULES
        // in the outer loop, count the number of lines in the pattern
        // in the inner loop, focus on the column and connect it to somewhere to the row
        // print this pattern inside the for loop
        //observe symmetry(optional)

        for( int i=0;i<4;i++){
            for( int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
