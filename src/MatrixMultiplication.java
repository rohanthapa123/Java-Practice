import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for 1st matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of cols for 1st matrix: ");
        int columns1 = sc.nextInt();

        System.out.print("Enter the number of rows for 2nd matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of cols for 2nd matrix: ");
        int columns2 = sc.nextInt();
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            sc.close();
            return;
        }
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        int[][] result = new int[rows1][columns2];

        System.out.println("Enter the elements of the 1st matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the 2nd matrix:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
