import java.util.Scanner;
public class SumOfElemenOfMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] array= new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter ("+ (i+1)+","+(j+1) + ")Element : ");
                array[i][j] = sc.nextInt();
                sum+=array[i][j];
            }
        }
        System.out.println("The sum of the elements of the given matrix is "+sum);
    }
}
