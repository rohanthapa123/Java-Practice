import java.util.Scanner;
public class SumOfEachRow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] array= new int[4][4];
        int[] sum= new int[4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("Enter ("+ (i+1)+","+(j+1) + ")Element : ");
                array[i][j] = sc.nextInt();
                sum[i]+=array[i][j];
            }
        }
        for(int i=0;i<4;i++)
            System.out.println("The sum of row "+ i + " is "+ sum[i]);
    }
}
