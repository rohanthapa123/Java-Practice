
import java.util.Scanner;

public class FourProgram29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opt;
        int i;
        do {
            System.out.println("1:To find area of Circle\n2:To check if the number is even or odd\n3:To find the sum of N numbers\n4:Exit");
            opt = sc.nextByte();
            switch (opt) {
                case 1:
                    System.out.print("Enter the radius of Circle: ");
                    float r = sc.nextFloat();
                    System.out.println("Area :" + Math.PI * r * r);
                    break;
                case 2:
                    System.out.print("Enter the number to check even or odd: ");
                    int num = sc.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Number upto which you want to find sum ");
                    int n = sc.nextInt(),sum = 0;
                    for (i = 1; i <= n; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (opt != 4);
    }
}
