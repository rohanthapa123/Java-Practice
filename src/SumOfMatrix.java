public class SumOfMatrix {
    public static void main(String[]args){
        int[][] matrixOne = {{12,25},{25,52}},matrixTwo = {{21,53},{53,64}};
        int[][] sum = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]= matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
           
        }
    }
}
